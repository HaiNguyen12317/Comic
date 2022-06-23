package com.example.adapter.callback

import android.view.View

interface OnComicItemClick {
    //B1: Tao inteface chua phuong thuc giua adapter voi activity
    fun onClick(position: Int)
}