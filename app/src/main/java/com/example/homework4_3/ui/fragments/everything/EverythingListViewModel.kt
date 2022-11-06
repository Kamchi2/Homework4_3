package com.example.homework4_3.ui.fragments.everything

import com.example.homework4_3.base.BaseViewModel
import com.example.homework4_3.data.repositorys.EverythingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EverythingListViewModel @Inject constructor(private val repository: EverythingRepository) :
    BaseViewModel() {

    fun fetchEverything() = repository.fetchEverything()

}