package com.example.adapter.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic
import com.example.adapter.responsity.ComicRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ComicViewModel @Inject constructor(private val comicRepository: ComicRepository) : ViewModel(){

    private val _itemComicResponse: MutableLiveData<Comic> = MutableLiveData()
    val itemComicResponse
        get() = _itemComicResponse

    private val _itemChapterResponse: MutableLiveData<Chapter> = MutableLiveData()
    val itemChapterResponse
        get() = _itemChapterResponse


    fun getAllComic(q: String) {
        viewModelScope.launch {
            _itemComicResponse.value = comicRepository.getAllComic(q)
        }
    }
}