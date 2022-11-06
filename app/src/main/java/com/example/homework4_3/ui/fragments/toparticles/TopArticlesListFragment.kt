package com.example.homework4_3.ui.fragments.toparticles

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework4_3.base.BaseFragment
import com.example.homework4_3.R
import com.example.homework4_3.databinding.FragmentSourcesBinding
import com.example.homework4_3.databinding.FragmentTopArticlesBinding
import com.example.homework4_3.ui.adapters.sources.SourcesListAdapter
import com.example.homework4_3.ui.adapters.toparticles.TopArticlesListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TopArticlesListFragment :
    BaseFragment<FragmentTopArticlesBinding, TopArticlesListViewModel>(R.layout.fragment_top_articles) {

    override val binding by viewBinding(FragmentTopArticlesBinding::bind)
    override val viewModel: TopArticlesListViewModel by viewModels()
    private val adapter = TopArticlesListAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.topArticlesRv.adapter = adapter
    }

    override fun setupSubscribes() {
        viewModel.fetchTopArticles().subscribe(
            onSuccess = {
                adapter.submitList(it.articles)
            },
            onError = {
                Log.e("log", it)
            }
        )
    }
}