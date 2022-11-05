package com.example.homework4_3.ui.adapters.sources

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homework4_3.base.BaseDiffUtilItemCallback
import com.example.homework4_3.databinding.ItemSourcesBinding
import com.example.homework4_3.models.sources.SourcesNewsModel

class SourcesListAdapter :
    ListAdapter<SourcesNewsModel, SourcesListAdapter.SourcesViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SourcesViewHolder =
        SourcesViewHolder(
            ItemSourcesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: SourcesViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class SourcesViewHolder(private val binding: ItemSourcesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: SourcesNewsModel) {
            binding.nameTv.text = model.name
            binding.descriptionTv.text = model.description
            binding.categoryTv.text = model.category
            binding.languageTv.text = model.language
        }

    }

}