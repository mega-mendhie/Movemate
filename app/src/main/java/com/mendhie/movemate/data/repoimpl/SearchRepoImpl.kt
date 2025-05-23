package com.mendhie.movemate.data.repoimpl

import androidx.lifecycle.LiveData
import com.mendhie.movemate.data.database.SearchDao
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.domain.repositories.SearchRepo
import javax.inject.Inject

/**
 * Implementation of [SearchRepo] that delegates calls to [SearchDao].
 *
 * @param searchDao DAO for accessing search result data.
 */
class SearchRepoImpl @Inject constructor(private val searchDao: SearchDao): SearchRepo {

    /**
     * Inserts a list of search results into the database.
     */
    override suspend fun insertSearchResults(results: List<SearchResult>) {
        searchDao.insertSearchResults(results)
    }

    /**
     * Retrieves search results matching the given query.
     */

    override fun getSearchResults(searchQuery: String): LiveData<List<SearchResult>> {
        return searchDao.getSearchResults(searchQuery)
    }

    /**
     * Retrieves all search results.
     */
    override fun getSearchResults(): LiveData<List<SearchResult>> {
        return searchDao.getSearchResults()
    }
}