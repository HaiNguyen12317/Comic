package com.example.adapter.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapter.adapter.ChapAdapter
import com.example.adapter.databinding.FragmentChapBinding
import com.example.adapter.model.Chap
import com.example.adapter.parse.ComicParse
import com.example.adapter.vm.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ChapFragment : Fragment() {
    private val listChap = arrayListOf<Chap>()
    private lateinit var viewModel : MainViewModel
    private lateinit var binding: FragmentChapBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChapBinding.inflate(inflater)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        val adapter = ChapAdapter(listChap)
        binding.rvChap.adapter = adapter
        binding.rvChap.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)

        lifecycleScope.launch (Dispatchers.IO){

            val chap = viewModel.link_chap.value?.let {
                ComicParse.getImg(it)
            }
            Log.d("anhhai", "chapter: ${viewModel._position_chap.value}")
            if (chap != null) {
                listChap.addAll(chap)
            }

//            listChapter.addAll(chapter)
//            listComic.addAll(ComicParse.getAllComic("view-source:http://www.nettruyenmoi.com"))
            withContext(Dispatchers.Main){
                adapter.run { this.notifyDataSetChanged() }
            }

            Log.d("anhhai","list anh ${listChap.size}")
        }
        return binding.root
    }
}