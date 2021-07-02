package test.view

import repository.StokBarangRepository
import repository.StokBarangRepositoryImpl
import service.StokBarangService
import service.StokBarangServiceImpl
import view.StokBarangView

fun main() {
    testSortStokBarang()
}

fun testAddStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangView.addStokBarang()
    stokBarangService.showStokBarang()
    stokBarangView.addStokBarang()
    stokBarangService.showStokBarang()
    stokBarangView.addStokBarang()
    stokBarangService.showStokBarang()
}

fun testShowStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangView.showStokBarang()
}

fun testUpdateStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()
    stokBarangView.updateStokBarang()
    stokBarangService.showStokBarang()
}

fun testRemoveStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()
    stokBarangView.removeStokBarang()
    stokBarangView.removeStokBarang()
    stokBarangService.showStokBarang()
}

fun testSearchStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()
    stokBarangView.searchStokBarang()
}

fun testSortStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)
    val stokBarangView = StokBarangView(stokBarangService)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()
    stokBarangView.sortStokBarang()
}