package com.mendhie.movemate.data.repoimpl

import androidx.lifecycle.LiveData
import com.mendhie.movemate.data.database.SearchDao
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.domain.repositories.SearchRepo
import javax.inject.Inject

class SearchRepoImpl @Inject constructor(private val searchDao: SearchDao): SearchRepo {
    override suspend fun insertSearchResults(results: List<SearchResult>) {
        searchDao.insertSearchResults(results)
    }

    override fun getSearchResults(searchQuery: String): LiveData<List<SearchResult>> {
        return searchDao.getSearchResults(searchQuery)
    }

    override fun getSearchResults(): LiveData<List<SearchResult>> {
        return searchDao.getSearchResults()
    }
}