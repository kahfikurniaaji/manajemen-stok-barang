package view

import service.StokBarangService
import util.InputUtil

class StokBarangView(val stokBarangService: StokBarangService) {
    fun addStokBarang() {
        println("MENAMBAHKAN STOK BARANG")

        val nama = InputUtil.inputString("Nama")
        val jumlah = InputUtil.inputString("Jumlah")
        val harga = InputUtil.inputString("Harga")

        try {
            stokBarangService.addStokBarang(nama, jumlah.toInt(), harga.toInt())
        } catch (exception: NumberFormatException) {
            println("GAGAL MENAMBAHKAN BARANG STOK KARENA INPUT SALAH")
        }
    }

    fun showStokBarang() {
        while (true) {
            stokBarangService.showStokBarang()

            println("MENU :")
            println("1. Tambah Stok Barang")
            println("2. Update Stok Barang")
            println("3. Hapus Stok Barang")
            println("4. Cari Data Barang")
            println("5. Sorting Barang Berdasarkan Stok Terkecil")
            println("0. Keluar")

            val input = InputUtil.inputString("Pilih")

            if (input == "1") {
                addStokBarang()
            } else if (input == "2") {
                updateStokBarang()
            } else if (input == "3") {
                removeStokBarang()
            } else if (input == "4") {
                searchStokBarang()
            } else if (input == "5") {
                sortStokBarang()
            } else if (input == "0") {
                break
            } else {
                println("PILIHAN TIDAK DIMENGERTI")
            }
        }
    }

    fun updateStokBarang() {
        println("MENGUPDATE STOK BARANG")

        val number = InputUtil.inputString("Pilih Nomor")
        val nama = InputUtil.inputString("Nama")
        val jumlah = InputUtil.inputString("Jumlah")
        val harga = InputUtil.inputString("Harga")

        try {
            stokBarangService.updateStokBarang(number.toInt(), nama, jumlah.toInt(), harga.toInt())
        } catch (exception: NumberFormatException) {
            println("GAGAL MENGUPDATE STOK KARENA INPUT SALAH")
        }
    }

    fun removeStokBarang() {
        println("MENGHAPUS STOK BARANG")

        val number = InputUtil.inputString("Pilih Nomor")
        try {
            stokBarangService.removeStokBarang(number.toInt())
        } catch (exception: NumberFormatException) {
            println("GAGAL MENGUPDATE STOK KARENA INPUT SALAH")
        }
    }

    fun searchStokBarang() {
        println("MENCARI BARANG BERDASARKAN NAMA")

        val nama = InputUtil.inputString("Masukan Nama Barang")
        stokBarangService.searchStokBarang(nama)
    }

    fun sortStokBarang() {
        println("SORTING BARANG BERDASARKAN STOK TERKECIL")

        stokBarangService.sortStokBarang()
    }
}