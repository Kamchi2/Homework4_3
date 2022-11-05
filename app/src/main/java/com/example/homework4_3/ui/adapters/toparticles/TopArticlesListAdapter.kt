package com.example.homework4_3.ui.adapters.toparticles

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.homework4_3.base.BaseDiffUtilItemCallback
import com.example.homework4_3.databinding.ItemTopArticlesBinding
import com.example.homework4_3.models.toparticles.TopArticlesNewsModel

class TopArticlesListAdapter :
    ListAdapter<TopArticlesNewsModel, TopArticlesListAdapter.TopArticlesViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopArticlesViewHolder =
        TopArticlesViewHolder(
            ItemTopArticlesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: TopArticlesViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class TopArticlesViewHolder(private val binding: ItemTopArticlesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: TopArticlesNewsModel) {
            binding.titleTv.text = model.title
            binding.imageIv.load(model.image)
        }
    }

}