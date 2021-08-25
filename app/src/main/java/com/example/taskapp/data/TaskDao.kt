package com.example.taskapp.data

import androidx.room.Dao

@Dao
interface TaskDao {

    suspend fun insert(task: Task)
}