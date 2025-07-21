package com.example.kisileruygulamasi.retrofit

import com.example.kisileruygulamasi.data.entity.KisilerCevap
import retrofit2.http.GET

interface KisilerDao {
    // http://kasimadalan.pe.hu/kisiler/tum_kisiler.php
    // http://kasimadalan.pe.hu --> base url
    // kisiler/tum_kisiler.php --> web servis url
    @GET("kisiler/tum_kisiler.php")
    suspend fun kisileriYukle() : KisilerCevap

}

