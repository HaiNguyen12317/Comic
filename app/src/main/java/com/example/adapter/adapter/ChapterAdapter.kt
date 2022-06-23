package com.example.adapter.adapter

import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.adapter.callback.OnComicItemClick
import com.example.adapter.databinding.ItemChapterBinding
import com.example.adapter.model.Chap
import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic
import com.example.adapter.view.fragment.ChapterFragmentDirections
import com.example.adapter.view.fragment.DeXuatFragmentDirections

class ChapterAdapter(private val chapters: List<Chapter>,private val onComicItemClick: OnComicItemClick): RecyclerView.Adapter<ChapterAdapter.ViewHolder>(){
//    private var binding: ItemChapterBinding? = null
//    private val differUtils = object : DiffUtil.ItemCallback<Chapter>() {
//        override fun areItemsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
//            return oldItem.chap == newItem.chap
//        }
//
//        override fun areContentsTheSame(oldItem:Chapter, newItem: Chapter): Boolean {
//            return oldItem == newItem
//        }
//    }
//    var differ = AsyncListDiffer(this, differUtils)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ChapterAdapter.ViewHolder {
      return ViewHolder(ItemChapterBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(chapters[position])
    }
    override fun getItemCount(): Int = chapters.size
    inner class ViewHolder(private val binding:ItemChapterBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(chapter: Chapter){
            binding.tvChap.text = chapter.chap
            binding.root.setOnClickListener{ /*itemView*/ this
                onComicItemClick.onClick(adapterPosition)

//                val intent: Intent = Intent(DeXuatFragment::class.java,ChatStoryFragment::class.java)
                //                binding.root.setOnClickListener {

            }
        }

    }
}