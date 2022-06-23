package com.example.adapter.parse

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.adapter.model.Chap
import com.example.adapter.model.Chapter
import com.example.adapter.model.Comic
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

object ComicParse  {
    fun getAllComic(): List<Comic>{
        val comics = arrayListOf<Comic>()
//        val link = "view-source:https://www.nettruyenmoi.com/"
        val link = "https://www.nettruyenonline.com/"
        val document: Document = Jsoup.connect(link).get()

        val comicElements = document.getElementsByClass("item")
            for (i in 0 until comicElements.size) {
                val comicElement: Element = comicElements[i]
                val url = comicElement.getElementsByTag("a").attr("href")
                val name = comicElement.getElementsByTag("a").attr("title")
                val img = comicElement.getElementsByTag("img").attr("src")
                comics.add(Comic(name, url, img))
            }
        return comics
    }

    fun getChap(position: Int): List<Chapter>{
        val comic = getAllComic()
        val link = comic[position].link.toString()
        val chaps = arrayListOf<Chapter>()
        val document: Document = Jsoup.connect(link).get()
        val chapElements = document.getElementsByClass("col-xs-9 chapter")
        for (i in 0 until chapElements.size){
            val chapElement = chapElements[i]
            val chap = chapElement.getElementsByTag("a").text().uppercase()
            val linkChap = chapElement.getElementsByTag("a").attr("href")
            chaps.add(Chapter(chap,linkChap))
        }
        return chaps
    }
    fun getImg(link : String) : List<Chap>{
        link
        Log.d("Anhhai", "link chap $link")
        val imgs = arrayListOf<Chap>()
        val document: Document = Jsoup.connect(link).get()
        val chapElements = document.getElementsByTag("li")
        for (i in 0 until chapElements.size){
            val chapElement = chapElements[i]
            val linkImg = chapElement.getElementsByTag("img").attr("src")
            imgs.add(Chap(linkImg))
        }
        return imgs
    }
}