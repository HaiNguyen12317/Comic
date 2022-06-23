package com.example.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapter.adapter.FComicAdapter
import com.example.adapter.adapter.FComicListAdapter
import com.example.adapter.databinding.ActivityFcomicBinding
import com.example.adapter.model.ComicFavorite
import com.example.adapter.vm.FavoriteComicViewModel
import com.example.adapter.vm.FavoriteComicViewModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.observeOn
import kotlinx.coroutines.launch

class FComicActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFcomicBinding
//    private lateinit var adapter : FComicAdapter
    private lateinit var adapter : FComicListAdapter


    private val vm : FavoriteComicViewModel by viewModels(){
        FavoriteComicViewModelFactory(application)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFcomicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FComicListAdapter()
        binding.rvFcomic.adapter = adapter
        binding.rvFcomic.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        vm.fcomics.observe(this
        ) {
//            fcomics.clear()
            adapter.submitList(it)
        }
        binding.btnAdd.setOnClickListener {
            val name = binding.edtName.text.toString()
            val image = binding.edtImage.text.toString()
            val link = binding.edtLink.text.toString()
            lifecycleScope.launch(Dispatchers.IO) {
                vm.addFComic(ComicFavorite(name, image,link) )
            }
            adapter.notifyDataSetChanged()

        }
        binding.btnEdit.setOnClickListener {
            val name = binding.edtName.text.toString()
            val image = binding.edtImage.text.toString()
            val link = binding.edtLink.text.toString()
            lifecycleScope.launch(Dispatchers.IO) {
               vm.updateFComic(ComicFavorite( name, image,link) )
            }


        }
        binding.btnDelete.setOnClickListener {
            val name = binding.edtName.text.toString()
            val image = binding.edtImage.text.toString()
            val link = binding.edtLink.text.toString()
            lifecycleScope.launch(Dispatchers.IO) {
                vm.deleteFComic(ComicFavorite( name, image,link) )
            }


        }

    }
}