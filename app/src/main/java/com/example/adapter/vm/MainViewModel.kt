package com.example.adapter.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic
import com.example.adapter.parse.ComicParse
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

//@HiltViewModel
class MainViewModel : ViewModel() {
    //    private var _list_comic :MutableLiveData<List<Comic>> = MutableLiveData()
//    val list_comic
//        get() = _list_comic
//    private var _item_comic :MutableLiveData<Comic> = MutableLiveData()
//    val item_comic
//        get() = _item_comic
//    private var _item_chap : MutableLiveData<Chapter> = MutableLiveData()
//    val item_chap
//        get() = _item_chap
    var _position_item: MutableLiveData<Int> = MutableLiveData()
    val position_item
        get() = _position_item
    var _position_chap: MutableLiveData<Int> = MutableLiveData()
    val position_chap
        get() = _position_chap

    var _comic = MutableLiveData<Comic>()
    val comic: LiveData<Comic>
        get() = _comic
    var _link_chap = MutableLiveData<String>()
    val link_chap: LiveData<String>
        get() = _link_chap

    var _chapter = MutableLiveData<Chapter>()
    val chapter : LiveData<Chapter>
    get() = _chapter
    var _all_chapter = MutableLiveData<List<Chapter>>()
    val all_chapter : LiveData<List<Chapter>>
        get()  = _all_chapter


}
//    fun getAllComic():MutableLiveData<List<Comic>>{
//        _list_comic.postValue(item_comic)
//        return list_comic
////    }
//    fun getComic(): MutableLiveData<Comic> {
////        val comics = arrayListOf<Comic>()
////        val link = "view-source:https://www.nettruyenmoi.com/"
//        val link = "https://www.nettruyenonline.com/"
//        val document: Document = Jsoup.connect(link).get()
//
//        val comicElements = document.getElementsByClass("item")
//        for (i in 0 until comicElements.size) {
//            val comicElement: Element = comicElements[i]
//            val url = comicElement.getElementsByTag("a").attr("href")
//            val name = comicElement.getElementsByTag("a").attr("title")
//            val img = comicElement.getElementsByTag("img").attr("src")
//            _item_comic.postValue(Comic(name,url,img))
//        }
//        return _item_comic
//    }
//
////    fun getChap(position: Int): List<Chapter>{
////        val comic = getAllComic()
////        val link = .link.toString()
////        val chaps = arrayListOf<Chapter>()
////        val document: Document = Jsoup.connect(link).get()
////        val chapElements = document.getElementsByClass("col-xs-9 chapter")
////        for (i in 0 until chapElements.size){
////            val chapElement = chapElements[i]
////            val chap = chapElement.getElementsByTag("a").text().uppercase()
////            val linkChap = chapElement.getElementsByTag("a").attr("href")
////            chaps.add(Chapter(chap,linkChap))
////        }
////        return chaps
////    }
////    fun getImg(position: Int) : List<Chap>{
////        val chap = getChap(position)
////        val link = chap[position].link
////        val imgs = arrayListOf<Chap>()
////        val document: Document = Jsoup.connect(link).get()
////        val chapElements = document.getElementsByTag("li")
////        for (i in 0 until chapElements.size){
////            val chapElement = chapElements[i]
////            val linkImg = chapElement.getElementsByTag("img").attr("src")
////            imgs.add(Chap(linkImg))
////        }
////        return imgs
////    }
//}
//
//private fun <T> MutableLiveData<T>.postValue(itemComic: MutableLiveData<Comic>) {
//    val comic = List<Comic>
//    comic.
//
//}
