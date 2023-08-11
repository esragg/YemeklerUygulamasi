package com.pisiitech.yemekleruygulamasi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pisiitech.yemekleruygulamasi.entity.Yemekler
import com.pisiitech.yemekleruygulamasi.repo.YemeklerDaoRepository

class AnasayfaViewModel : ViewModel() {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yrepo = YemeklerDaoRepository()

    init {
        yemekleriYukle()
        yemeklerListesi  = yrepo.yemekleriGetir()
    }

    fun yemekleriYukle() {
        yrepo.tumYemekleriAl()
    }
}