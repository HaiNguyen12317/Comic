package com.example.adapter.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapter.ComicActivity
import com.example.adapter.adapter.Chapter2Adapter
import com.example.adapter.adapter.ChapterAdapter
import com.example.adapter.callback.OnComicItemClick
import com.example.adapter.databinding.FragmentChapterBinding
import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic
import com.example.adapter.parse.ComicParse
import com.example.adapter.vm.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ChapterFragment : Fragment(),OnComicItemClick{
//    private var itemChapterAdapter = ChapterAdapter()
    private val listChapter = arrayListOf<Chapter>()
    private var comic: Comic = Comic()
//    private val listComic = arrayListOf<Comic>()

    private lateinit var viewModel : MainViewModel
    private lateinit var binding: FragmentChapterBinding
//    init {
//        var bundle :Bundle ?=intent.extras
//        var title = bundle!!.getString("title")
//        var catId = bundle!!.getString("catId")
////        val bundle: Bundle = inten
//        val p = bundle?.getSerializable("position")
//    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChapterBinding.inflate(inflater)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        val adapter = ChapterAdapter(listChapter,this)
        binding.rvChapter.adapter = adapter
        binding.rvChapter.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)

        lifecycleScope.launch (Dispatchers.IO){


            val chapter = viewModel.position_item.value?.let {
                ComicParse.getChap(it)
            }

            chapter?.let { listChapter.addAll(it) }
            Log.d("Anhhai", "size : ${listChapter.size}")
            withContext(Dispatchers.Main){
                adapter.run { this.notifyDataSetChanged() }
            }
        }


        return binding.root
    }

    override fun onClick(position: Int) {
        viewModel._link_chap.postValue(listChapter[position].link)

        val action = ChapterFragmentDirections.actionChapterFragmentToChapFragment()
        findNavController().navigate(action)
    }

//    override fun onClick(position: Int) {
//        lifecycleScope.launch (Dispatchers.IO){
//
//            //"https://www.nettruyenonline.com/chi-tiet/than-tinh-vat-ngu.html"
//            val chapter = ComicParse.getChap(position)
//            Log.d("anhhai","size chapter${chapter.size}")
//            listChapter.addAll(chapter)
////            listComic.addAll(ComicParse.getAllComic("view-source:http://www.nettruyenmoi.com"))
//            withContext(Dispatchers.Main){
//              //  adapter.run { this.notifyDataSetChanged() }
//            }
//            listChapter.addAll(chapter)
//            val action = DeXuatFragmentDirections.actionDeXuatFragmentToChapterFragment()
//            findNavController().navigate(action)
//        }
//    }
}