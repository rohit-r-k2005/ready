package com.agree.hello.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "documents")
data class DocumentEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val filename: String,
    val filepath: String,
    val dateAdded: Long
)
