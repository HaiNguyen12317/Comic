package com.example.adapter.db

import androidx.recyclerview.widget.DiffUtil
import com.example.adapter.model.ComicFavorite
object FComicItemCallback: DiffUtil.ItemCallback<ComicFavorite>(){
    override fun areItemsTheSame(oldItem: ComicFavorite, newItem: ComicFavorite): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: ComicFavorite, newItem: ComicFavorite): Boolean {
        return oldItem == newItem
    }
}