package com.example.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adapter.adapter.ComicPagerAdapter
import com.example.adapter.databinding.ActivityComicBinding
import com.example.adapter.view.fragment.DeXuatFragment
import com.google.android.material.tabs.TabLayoutMediator

class ComicActivity : AppCompatActivity() {
    var position: Int = 0
    private val tabs = arrayOf("Đề Xuất", "Chat Story")
    private lateinit var binding:ActivityComicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComicBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        supportFragmentManager.beginTransaction().commit()
        val adapter = ComicPagerAdapter(this)
        binding.vpComic.adapter = adapter
        TabLayoutMediator(binding.tlMain, binding.vpComic) { tab, index ->
            run {
                tab.text = tabs[index]
            }
        }.attach()

    }
}