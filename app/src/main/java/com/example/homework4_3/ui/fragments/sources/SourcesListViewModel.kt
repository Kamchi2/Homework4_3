package com.example.homework4_3.ui.fragments.sources

import com.example.homework4_3.base.BaseViewModel
import com.example.homework4_3.data.repositorys.TopHeadlinesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SourcesListViewModel @Inject constructor(private val repository: TopHeadlinesRepository) :
    BaseViewModel() {

    fun fetchSources() = repository.fetchSources()

}