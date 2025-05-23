package com.mendhie.movemate.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.domain.repositories.SearchRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val searchRepo: SearchRepo): ViewModel() {

    val defaultSearchResults = searchRepo.getSearchResults()

    suspend fun insertSearchResults(results: List<SearchResult>){
        searchRepo.insertSearchResults(results)
    }

    fun getSearchResults(searchQuery: String): LiveData<List<SearchResult>>{
        return searchRepo.getSearchResults(searchQuery)
    }
}