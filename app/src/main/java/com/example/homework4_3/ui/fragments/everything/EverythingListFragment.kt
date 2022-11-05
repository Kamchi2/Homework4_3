package com.example.homework4_3.ui.fragments.everything

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework4_3.base.BaseFragment
import com.example.homework4_3.R
import com.example.homework4_3.databinding.FragmentEverythingBinding
import com.example.homework4_3.ui.adapters.everything.EverythingListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EverythingListFragment :
    BaseFragment<FragmentEverythingBinding, EverythingListViewModel>(R.layout.fragment_everything) {

    override val binding by viewBinding(FragmentEverythingBinding::bind)
    override val viewModel: EverythingListViewModel by viewModels()
    private val adapter = EverythingListAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.everythingRv.adapter = adapter
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