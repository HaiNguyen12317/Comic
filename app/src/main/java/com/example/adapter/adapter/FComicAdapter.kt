package com.example.adapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.databinding.ActivityFcomicBinding
import com.example.adapter.databinding.ItemFComicBinding
import com.example.adapter.diff.FComicDiffCallback
import com.example.adapter.model.ComicFavorite

class FComicAdapter: RecyclerView.Adapter<FComicAdapter.ViewHolder>() {
    private val f_comics =  arrayListOf<ComicFavorite>()

    fun submit(items : List<ComicFavorite>){
        val diffCallbak = FComicDiffCallback(f_comics,items)
        val diff = DiffUtil.calculateDiff(diffCallbak)
        this.f_comics.clear()
        this.f_comics.addAll(items)
        diff.dispatchUpdatesTo(this)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFComicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(f_comics[position])
    }

    override fun getItemCount(): Int = f_comics.size
    class ViewHolder(private val binding: ItemFComicBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(fcomic : ComicFavorite){
            binding.tvFcomic.text = fcomic.toString()

        }

    }
}