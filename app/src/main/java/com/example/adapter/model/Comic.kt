package com.example.adapter.model

import android.os.Parcelable
import androidx.lifecycle.MutableLiveData
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.io.Serializable
//@kotlinx.serialization.Serializable
//@Parcelize
data class item(
    var status: String,
    var comic: List<Comic>,
)
data class Comic(
    val name: String = "",
    val link: String = "",
    val image: String = "",
//    val chap: List<Chapter>
)//: Parcelable
data class Chap(
    val img :String ="",
)



