package com.example.adapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.adapter.R
import com.example.adapter.adapter.ComicAdapter.ViewHolder
import com.example.adapter.callback.OnComicItemClick
import com.example.adapter.databinding.ItemComicBinding
import com.example.adapter.diff.ComicDiffUntil
import com.example.adapter.model.Comic
import kotlin.io.path.createTempDirectory


//pas callback to constructor
class ComicAdapter2(
                    private val callback: OnComicItemClick
                   ): RecyclerView.Adapter<ComicAdapter2.ViewHolder>(){


    private val comics = mutableListOf<Comic>()

    fun submitComics(temp: List<Comic>){
        val diffCallback = ComicDiffUntil(comics,temp)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.comics.clear()
        this.comics.addAll(temp)
        diffResult.dispatchUpdatesTo(this)
    }

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
            ).into(binding.imgAvt)
            binding.tvTitle.text = comic.name
            binding.root.setOnClickListener{
                Toast.makeText(
                    binding.root.context,
                    "Click ${comic.name}",Toast.LENGTH_SHORT
                ).show()
            }
            binding.imgAvt.setOnClickListener{
                callback.onClick(adapterPosition)
            }

        }
    }


//    class ViewHolder{
//        fun bind(comic : Comic){
//
//        }
//    }

//
//        override fun getCount(): Int = comics.size
//
//    override fun getItem(p0: Int): Any {
//       return comics[p0]
//    }
//
//    override fun getItemId(p0: Int): Long {
//        return p0.toLong()
//    }

//        val view =  LayoutInflater.from(p2?.context).inflate(R.layout.item_comic,p2,false)
//        val imgAvatar: ImageView = view.findViewById(R.id.img_avt)
//        val tvName: TextView = view.findViewById(R.id.tv_title)


//        tvName.text = comic.name
//override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
//        val comic = comics[position]
//        val viewHolder: ViewHolder
//        val binding: ItemComicBinding?
//        if (convertView == null){
//            binding = ItemComicBinding.inflate(LayoutInflater.from(p2?.context))
//            Glide.with(binding.imgAvt).load(
//                comic.image
//            ).into(binding.imgAvt)
//            binding.tvTitle.text = comic.name
//
//            viewHolder = ViewHolder(binding)
//            binding.root.tag = viewHolder
//
//        }else{
//            viewHolder = convertView.tag as ViewHolder
//        }

    //        return binding.root
//    }

}