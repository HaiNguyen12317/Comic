package com.example.adapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.adapter.databinding.ItemChapBinding
import com.example.adapter.model.Chap

class ChapAdapter(private val chaps: List<Chap>): RecyclerView.Adapter<ChapAdapter.ViewHolder>() {


    //    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(ItemChapBinding.inflate(LayoutInflater.from(parent.context)))
//    }
//
//    override fun onBindViewHolder(holder: ChapterAdapter.ViewHolder, position: Int) {
//        holder.bind(chaps[position])
//    }
//    override fun getItemCount(): Int = chaps.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapAdapter.ViewHolder {
        return ViewHolder(ItemChapBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ChapAdapter.ViewHolder, position: Int) {
        holder.bind(chaps[position])
    }

    override fun getItemCount(): Int = chaps.size
    class ViewHolder(private val binding: ItemChapBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(chap: Chap){
            Glide.with(binding.imgChap).load(
                chap.img
            ).centerCrop().into(binding.imgChap)
        }
    }


}