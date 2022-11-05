package com.example.homework4_3.ui.adapters.everything

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homework4_3.base.BaseDiffUtilItemCallback
import com.example.homework4_3.databinding.ItemEverythingBinding
import com.example.homework4_3.models.everything.EverythingNewsModel

class EverythingListAdapter :
    ListAdapter<EverythingNewsModel, EverythingListAdapter.EverythingViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EverythingViewHolder =
        EverythingViewHolder(
            ItemEverythingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: EverythingViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class EverythingViewHolder(private val binding: ItemEverythingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: EverythingNewsModel) {
            binding.titleTv.text = model.title
        }
    }

}