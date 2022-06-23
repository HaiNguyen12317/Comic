package com.example.adapter.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.adapter.databinding.FragmentChatstoryBinding

class ChatStoryFragment : Fragment() {
    private lateinit var binding: FragmentChatstoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatstoryBinding.inflate(inflater)
        return binding.root
    }
}