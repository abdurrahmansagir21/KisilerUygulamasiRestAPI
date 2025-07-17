package com.example.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AnasayfaViewModel @Inject constructor(var krepo: KisilerRepository) : ViewModel() {

    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisileriyukle()
    }

    fun sil(kisi_id: Int) {
        viewModelScope.launch {
            krepo.sil(kisi_id)
            kisileriyukle()
        }
    }

    fun kisileriyukle() {
        viewModelScope.launch {
            kisilerListesi.value = krepo.kisileriyukle()
        }
    }

    fun ara(aramaKelimesi: String) {
        viewModelScope.launch {
            kisilerListesi.value = krepo.ara(aramaKelimesi)
        }
    }

}