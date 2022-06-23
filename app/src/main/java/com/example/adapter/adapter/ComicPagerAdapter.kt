package com.example.adapter.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.adapter.ComicActivity
import com.example.adapter.view.fragment.ChatStoryFragment
import com.example.adapter.view.fragment.DeXuatFragment
import java.lang.IllegalArgumentException

class ComicPagerAdapter (private val comicActivity: ComicActivity) : FragmentStateAdapter(comicActivity) {
    private val tabs = arrayOf("Đề Xuất", "Chat Story")

    override fun getItemCount() = tabs.size
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> DeXuatFragment()
            1 -> ChatStoryFragment()
            else -> throw IllegalArgumentException("Unknown fragment for position $position")
        }
    }
}