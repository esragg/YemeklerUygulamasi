package com.pisiitech.yemekleruygulamasi.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pisiitech.yemekleruygulamasi.entity.Yemekler
import com.pisiitech.yemekleruygulamasi.repo.YemeklerDaoRepository

class AnasayfaViewModel(application:Application) : AndroidViewModel(application) {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yrepo = YemeklerDaoRepository(application)

    init {
        yemekleriYukle()
        yemeklerListesi  = yrepo.yemekleriGetir()
    }

    fun yemekleriYukle() {
        yrepo.tumYemekleriAl()
    }
}