package com.example.adapter.adapter

import android.content.Intent
import android.content.IntentFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.adapter.R
import com.example.adapter.adapter.ComicAdapter.ViewHolder
import com.example.adapter.callback.OnComicItemClick
import com.example.adapter.databinding.ItemComicBinding
import com.example.adapter.model.Comic
import com.example.adapter.view.fragment.ChatStoryFragment
import com.example.adapter.view.fragment.DeXuatFragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide.init
import com.example.adapter.view.fragment.DeXuatFragmentDirections
import kotlin.properties.Delegates


//pas callback to constructor
class ComicAdapter(private val comics: List<Comic>, private val onComicItemClick: OnComicItemClick): RecyclerView.Adapter<ComicAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemComicBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(comics[position])
    }

    override fun getItemCount(): Int = comics.size
    inner class ViewHolder(private val binding: ItemComicBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(comic: Comic){
            Glide.with(binding.imgAvt).load(
                comic.image
            ).centerCrop().into(binding.imgAvt)
            binding.tvTitle.text = comic.name


            binding.root.setOnClickListener{itemView

               onComicItemClick.onClick(adapterPosition)
//                val action = DeXuatFragmentDirections.actionDeXuatFragmentToChapterFragment()
//                itemView.findNavController().navigate(action)
//                val intent: Intent = Intent(DeXuatFragment::class.java,ChatStoryFragment::class.java)
            //                binding.root.setOnClickListener {

                }
            }

    }




}



