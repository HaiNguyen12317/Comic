package com.example.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import com.example.adapter.model.Chapter

object ChapterItemCallback : DiffUtil.ItemCallback<Chapter>() {
    override fun areItemsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
        return oldItem.chap == newItem.chap
    }

    override fun areContentsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
        return oldItem == newItem
    }
}