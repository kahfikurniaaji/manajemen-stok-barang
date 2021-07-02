package entity

import java.text.DateFormat
import java.util.*

data class StokBarang(
    val nama: String,
    val jumlah: Int,
    val harga: Int,
    val totalHarga: Int = jumlah * harga
){
    val tanggal: String = DateFormat.getInstance().format(Date())
}
