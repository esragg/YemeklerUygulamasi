package com.pisiitech.yemekleruygulamasi.room

import androidx.room.Dao
import androidx.room.Query
import com.pisiitech.yemekleruygulamasi.entity.Yemekler

@Dao
interface YemeklerDao {

    @Query("SELECT * FROM yemekler")
    suspend fun tumYemekler():List<Yemekler>
}