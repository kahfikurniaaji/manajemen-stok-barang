package repository

import entity.StokBarang

class StokBarangRepositoryImpl : StokBarangRepository {

    private val stok = ArrayList<StokBarang>()

    override fun add(stokBarang: StokBarang): Boolean {
        return try {
            stok.add(stokBarang)
        } catch (exception: IndexOutOfBoundsException) {
            false
        } catch (exception: NumberFormatException) {
            false
        }
    }

    override fun getAll(): ArrayList<StokBarang> {
        return stok
    }

    override fun update(number: Int, stokBarang: StokBarang): Boolean {
        return try {
            val oldStok = stok.set(number - 1, stokBarang)
            oldStok != stokBarang
        } catch (exception: IndexOutOfBoundsException) {
            false
        } catch (exception: NumberFormatException) {
            false
        }
    }

    override fun remove(number: Int): Boolean {
        return try {
            stok.remove(stok.get(number - 1))
        } catch (e: IndexOutOfBoundsException) {
            false
        }
    }

    override fun search(nama: String): StokBarang {
        for (value in stok) {
            if (value.nama == nama) {
                return value
            }
        }
        return StokBarang("", 0, 0)
    }

    override fun sort(): ArrayList<StokBarang> {
        val model = stok
        val size = model.size - 1
        for (i in 0 until size) {
            for (j in 0 until size - i) {
                if (model[j].jumlah > model[j + 1].jumlah) {
                    val temp = model[j]
                    model[j] = model[j + 1]
                    model[j + 1] = temp
                }
            }
        }
        return model
    }
}