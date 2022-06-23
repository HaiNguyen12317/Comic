package com.example.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.adapter.adapter.ComicAdapter
import com.example.adapter.callback.OnComicItemClick
import com.example.adapter.databinding.ActivityMainBinding
import com.example.adapter.model.Comic

//B2: Implement method callback
class MainActivity : AppCompatActivity() , OnComicItemClick{
    private lateinit var binding: ActivityMainBinding
//    private val comics = arrayListOf(
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//        Comic("Đệ Nhất Người Ở Rể","http://www.nettruyenmoi.com/truyen-tranh/de-nhat-nguoi-o-re-353710","https://cf.shopee.vn/file/01d013a70dc8ba34265dcb13ac3b8e90"),
//
//        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val adapter = ComicAdapter(comics)
//
//        binding.rvComic.layoutManager = GridLayoutManager(this, 3)
//
//        binding.rvComic.adapter = adapter



    }

    override fun onClick(postition: Int) {
        Log.d("anh hai","click $postition")
    }
}