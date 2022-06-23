package com.example.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import com.example.adapter.model.ComicFavorite

class FComicDiffCallback(
    private val oldItem: List<ComicFavorite>,
    private val newItem: List<ComicFavorite>
                         ) : DiffUtil.Callback(){
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int  = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItem[oldItemPosition].name == newItem[newItemPosition].name
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItem[oldItemPosition] == newItem[newItemPosition]
    }
}