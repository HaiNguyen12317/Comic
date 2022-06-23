package com.example.adapter.view.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.adapter.adapter.ComicAdapter
import com.example.adapter.adapter.ComicAdapter2
import com.example.adapter.callback.OnComicItemClick
import com.example.adapter.databinding.FragmentDexuatBinding
import com.example.adapter.model.Comic
import com.example.adapter.parse.ComicParse
import com.example.adapter.vm.MainViewModel
//import com.example.adapter.vm.MainViewModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DeXuatFragment : Fragment(), OnComicItemClick{
    private lateinit var viewModel : MainViewModel
    private val listComic = arrayListOf<Comic>()

    private lateinit var binding: FragmentDexuatBinding
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDexuatBinding.inflate(inflater)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        val adapter = ComicAdapter2(this)
//        val adapter = ComicAdapter(listComic,this)
        adapter.submitComics(listComic)

        binding.rvComics.adapter = adapter
        binding.rvComics.layoutManager = GridLayoutManager(requireContext(),3)
        lifecycleScope.launch (Dispatchers.IO){

            val comic = ComicParse.getAllComic()
//            Log.d("anhhai","list comic ${comic.size}")
            listComic.addAll(comic)

//            listComic.addAll(ComicParse.getAllComic("view-source:http://www.nettruyenmoi.com"))
            withContext(Dispatchers.Main){
                adapter.run { this.notifyDataSetChanged()
                    adapter.submitComics(listComic)
                }
            }


        }
//        binding.rvComics.getChildItemId(binding.rvComics)
//        val chapAdapter = ChapterAdapter(lisChap)
//        binding.rvComics.adapter = chapAdapter
//        binding.rvComics.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
//        val chap = ComicParse.getChap()
//        Log.d("anhhai", "position ${viewModel.position_item}")
//        viewModel.position_item
        return binding.root
    }

    override fun onClick(position: Int) {
//            viewModel.getPosition(position)
        viewModel._position_item.postValue(position)
        viewModel._comic.postValue(listComic[position])
        Log.d("anh hai","list comic ${viewModel._comic.value.toString()}")
        val action = DeXuatFragmentDirections.actionDeXuatFragmentToChapterFragment()
        findNavController().navigate(action)
        }


////    }

}


