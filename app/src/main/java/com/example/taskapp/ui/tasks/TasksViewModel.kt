package com.example.taskapp.ui.tasks

import androidx.lifecycle.ViewModel
import com.example.taskapp.data.TaskDao
import dagger.hilt.android.scopes.ViewModelScoped

class TasksViewModel @ViewModelScoped constructor(

    private val taskDao : TaskDao

    ): ViewModel(){
}