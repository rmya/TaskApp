package com.example.taskapp.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.lang.reflect.Array.get
import java.text.DateFormat

@Entity(tableName = "task_table")
@Parcelize
data class Task(

    val name: String,
    val important: Boolean = false,
    val completed: Boolean = false,
    val created: Long = System.currentTimeMillis(),
    @PrimaryKey(autoGenerate = true) val id: Int = 0

) : Parcelable {
    val creratedDateFormatted: String
        get() = DateFormat.getDateTimeInstance().format(created)

}