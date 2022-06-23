package com.example.adapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.databinding.ItemChapterBinding
import com.example.adapter.diff.ChapterItemCallback
import com.example.adapter.model.Chapter


class Chapter2Adapter : ListAdapter<Chapter , Chapter2Adapter.ViewHolder>(ChapterItemCallback){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemChapterBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Chapter2Adapter.ViewHolder, position: Int) {
        val item = getItem(position)
        item?.let {
            holder.bind(it)
        }
    }

    class ViewHolder (private val binding: ItemChapterBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(chapter: Chapter){
            binding.tvChap.text = chapter.chap
        }
    }

}