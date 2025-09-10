package com.agree.hello.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.agree.hello.entity.DocumentEntity

@Dao
interface DocumentDao {
    @Insert
    suspend fun insert(document: DocumentEntity)

    @Query("SELECT * FROM documents")
    suspend fun getAll(): List<DocumentEntity>
}