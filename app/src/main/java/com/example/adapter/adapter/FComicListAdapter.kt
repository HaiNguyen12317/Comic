package com.example.adapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.databinding.ItemFComicBinding
import com.example.adapter.db.FComicItemCallback
import com.example.adapter.model.ComicFavorite

class FComicListAdapter : ListAdapter<ComicFavorite, FComicListAdapter.ViewHolder>(FComicItemCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FComicListAdapter.ViewHolder {
        return ViewHolder(
            ItemFComicBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: FComicListAdapter.ViewHolder, position: Int) {
        val item = getItem(position)
        item?.let {
            holder.bind(it)
        }
    }
    class ViewHolder(private val binding: ItemFComicBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(fcomic: ComicFavorite){
            binding.tvFcomic.text = fcomic.toString()
        }

    }


}