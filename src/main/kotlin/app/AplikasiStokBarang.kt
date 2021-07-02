package app

import repository.StokBarangRepositoryImpl
import service.StokBarangServiceImpl
import view.StokBarangView

fun main() {
    val stokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangView.showStokBarang()
}