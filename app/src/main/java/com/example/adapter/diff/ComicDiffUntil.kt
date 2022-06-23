package com.example.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import com.example.adapter.model.Comic

class ComicDiffUntil(
    private val oldComics: List<Comic>,
    private val newComics: List<Comic>
    ): DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldComics.size

    override fun getNewListSize(): Int = newComics.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldComics[oldItemPosition].name == newComics[newItemPosition].name
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldComics[oldItemPosition] == newComics[newItemPosition]
    }
}