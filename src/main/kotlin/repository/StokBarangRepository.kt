package repository

import entity.StokBarang

interface StokBarangRepository {

    fun add(stokBarang: StokBarang): Boolean

    fun getAll(): ArrayList<StokBarang>

    fun update(number: Int, stokBarang: StokBarang): Boolean

    fun remove(number: Int): Boolean

    fun search(nama: String): StokBarang

    fun sort(): ArrayList<StokBarang>

}