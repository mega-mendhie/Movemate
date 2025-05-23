package com.mendhie.movemate.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.data.models.Shipment

@Dao
interface SearchDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertSearchResults(results: List<SearchResult>)

    @Query("SELECT * FROM search_table WHERE trackingNumber LIKE :searchQuery")
    fun getSearchResults(searchQuery: String): LiveData<List<SearchResult>>

    @Query("SELECT * FROM search_table")
    fun getSearchResults(): LiveData<List<SearchResult>>
}