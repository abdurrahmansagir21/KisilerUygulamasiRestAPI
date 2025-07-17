package com.example.kisileruygulamasi.data.entity

import androidx.recyclerview.widget.RecyclerView
import com.example.kisileruygulamasi.databinding.CardTasarimBinding
import java.io.Serializable

data class Kisiler(var kisi_id: Int, var kisi_ad: String, var kisi_tel: String) : Serializable {

}