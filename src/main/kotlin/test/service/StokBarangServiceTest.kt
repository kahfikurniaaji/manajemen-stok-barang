package test.service

import repository.StokBarangRepository
import repository.StokBarangRepositoryImpl
import service.StokBarangService
import service.StokBarangServiceImpl

fun main() {
    testSortStokBarang()
}

fun testAddStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()
}

fun testShowStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()
}

fun testUpdateStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()

    stokBarangService.updateStokBarang(2, "Aqua Gelas", 5000, 1000)
    stokBarangService.updateStokBarang(3, "Aqua Gelas", 5000, 1000)
    stokBarangService.showStokBarang()
}

fun testRemoveStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()

    stokBarangService.removeStokBarang(5)
    stokBarangService.removeStokBarang(1)
    stokBarangService.showStokBarang()
    stokBarangService.removeStokBarang(3)
    stokBarangService.showStokBarang()
    stokBarangService.removeStokBarang(2)
    stokBarangService.showStokBarang()
}

fun testSearchStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)

    stokBarangService.showStokBarang()

    stokBarangService.searchStokBarang("malam")
    stokBarangService.searchStokBarang("Aqua Gelas")
}

fun testSortStokBarang() {
    val stokBarangRepository: StokBarangRepository = StokBarangRepositoryImpl()
    val stokBarangService: StokBarangService = StokBarangServiceImpl(stokBarangRepository)

    stokBarangService.addStokBarang("Aqua Botol", 1000, 3500)
    stokBarangService.addStokBarang("Aqua Gelas", 5000, 1000)
    stokBarangService.addStokBarang("Le Mineral", 2000, 3000)
    stokBarangService.addStokBarang("Le Narelal", 1500, 1500)

    stokBarangService.sortStokBarang()
}