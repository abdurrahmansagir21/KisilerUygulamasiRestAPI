package com.example.kisileruygulamasi.ui.viewmodel

import android.content.ContentUris
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel

class KisiKayitViewModel @Inject constructor(var krepo: KisilerRepository) : ViewModel() {

    fun kaydet(kisi_ad: String, kisi_tel: String) {
        viewModelScope.launch {
            krepo.kaydet(kisi_ad, kisi_tel)
        }

    }
}