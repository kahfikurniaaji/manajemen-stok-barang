package service

interface StokBarangService {

    fun addStokBarang(nama: String, jumlah: Int, harga: Int)

    fun showStokBarang()

    fun updateStokBarang(number: Int, nama: String, jumlah: Int, harga: Int)

    fun removeStokBarang(number: Int)

    fun searchStokBarang(nama: String)

    fun sortStokBarang()
}