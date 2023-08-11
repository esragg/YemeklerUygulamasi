package com.pisiitech.yemekleruygulamasi.repo

import androidx.lifecycle.MutableLiveData
import com.pisiitech.yemekleruygulamasi.entity.Yemekler

class YemeklerDaoRepository {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()

    init {
        yemeklerListesi = MutableLiveData()
    }

    fun yemekleriGetir() : MutableLiveData<List<Yemekler>> {
        return yemeklerListesi
    }

    fun tumYemekleriAl() {
        val liste = mutableListOf<Yemekler>()
        val y1 = Yemekler(1,"Köfte","kofte",15)
        val y2 = Yemekler(2,"Ayran","ayran",2)
        val y3 = Yemekler(3,"Fanta","fanta",3)
        val y4 = Yemekler(4,"Makarna","makarna",14)
        val y5 = Yemekler(5,"Kadayıf","kadayif",8)
        val y6 = Yemekler(6,"Baklava","baklava",15)

        liste.add(y1)
        liste.add(y2)
        liste.add(y3)
        liste.add(y4)
        liste.add(y5)
        liste.add(y6)

        yemeklerListesi.value = liste
    }
}