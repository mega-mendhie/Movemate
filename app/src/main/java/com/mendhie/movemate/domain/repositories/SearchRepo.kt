package com.mendhie.movemate.domain.repositories

import androidx.lifecycle.LiveData
import com.mendhie.movemate.data.models.SearchResult

interface SearchRepo {

    suspend fun insertSearchResults(results: List<SearchResult>)

    fun getSearchResults(searchQuery: String): LiveData<List<SearchResult>>

    fun getSearchResults(): LiveData<List<SearchResult>>
}