package com.example.homework4_3.ui.fragments.sources

import android.app.Fragment
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework4_3.base.BaseFragment
import com.example.homework4_3.R
import com.example.homework4_3.databinding.FragmentEverythingBinding
import com.example.homework4_3.databinding.FragmentSourcesBinding
import com.example.homework4_3.ui.adapters.everything.EverythingListAdapter
import com.example.homework4_3.ui.adapters.sources.SourcesListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SourcesListFragment :
    BaseFragment<FragmentSourcesBinding, SourcesListViewModel>(R.layout.fragment_sources) {

    override val binding by viewBinding(FragmentSourcesBinding::bind)
    override val viewModel: SourcesListViewModel by viewModels()
    private val adapter = SourcesListAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.sourcesRv.adapter = adapter
    }

    override fun setupSubscribes() {
        viewModel.fetchPokemonName().subscribe(
            onSuccess = {
                adapter.submitList(it.articles)
            },
            onError = {
                Log.e("log", it)
            }
        )
    }
}