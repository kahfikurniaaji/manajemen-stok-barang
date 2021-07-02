package service

import entity.StokBarang
import repository.StokBarangRepository

class StokBarangServiceImpl(val stokBarangRepository: StokBarangRepository) : StokBarangService {

    override fun addStokBarang(nama: String, jumlah: Int, harga: Int) {
        val stokBarang = StokBarang(nama, jumlah, harga)
        val success = stokBarangRepository.add(stokBarang)
        if (success) {
            println("SUKSES MENAMBAH PRODUK ${stokBarang.nama}")
        } else {
            println("GAGAL MENAMBAH PRODUK ${stokBarang.nama}")
        }
    }

    override fun showStokBarang() {
        val model = stokBarangRepository.getAll()

        if (model.isNullOrEmpty()) {
            println("STOK KOSONG")
        } else {
            println("========================================================================")
            println("NO.\tTANGGAL  WAKTU\tNAMA PRODUK\t\tSTOK\tHARGA SATUAN\tHARGA TOTAL")
            println("========================================================================")
            var counter = 0

            for (value in model) {
                counter++
                println("$counter.\t${value.tanggal}\t${value.nama}\t\t${value.jumlah}\t${value.harga}\t\t\t${value.totalHarga}")
            }
            println("========================================================================")
        }
    }

    override fun updateStokBarang(number: Int, nama: String, jumlah: Int, harga: Int) {
        val stokBarang = StokBarang(nama, jumlah, harga)
        val success = stokBarangRepository.update(number, stokBarang)
        if (success) {
            println("SUKSES MENGUPDATE BARANG NO $number")
        } else {
            println("GAGAL MENGUPDATE BARANG NO $number")
        }
    }

    override fun removeStokBarang(number: Int) {
        val success = stokBarangRepository.remove(number)
        if (success) {
            println("SUKSES MENGHAPUS BARANG NO $number")
        } else {
            println("GAGAL MENGHAPUS BARANG NO $number")
        }
    }

    override fun searchStokBarang(nama: String) {
        val stokBarang = stokBarangRepository.search(nama)
        if (stokBarang.nama.isBlank()) {
            println("BARANG TIDAK DITEMUKAN")
        } else {
            println("========================================================================")
            println("TANGGAL  WAKTU\tNAMA PRODUK\t\tSTOK\tHARGA SATUAN\tHARGA TOTAL")
            println("========================================================================")
            println("${stokBarang.tanggal}\t${stokBarang.nama}\t\t${stokBarang.jumlah}\t${stokBarang.harga}\t\t\t${stokBarang.totalHarga}")
            println("========================================================================")
            println("BARANG DITEMUKAN")
        }
    }

    override fun sortStokBarang() {
        val model = stokBarangRepository.sort()

        if (model.isNullOrEmpty()) {
            println("STOK KOSONG")
        } else {
            println("========================================================================")
            println("NO.\tTANGGAL  WAKTU\tNAMA PRODUK\t\tSTOK\tHARGA SATUAN\tHARGA TOTAL")
            println("========================================================================")
            var counter = 0

            for (value in model) {
                counter++
                println("$counter.\t${value.tanggal}\t${value.nama}\t\t${value.jumlah}\t${value.harga}\t\t\t${value.totalHarga}")
            }
            println("========================================================================")
        }
    }
}