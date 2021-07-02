package util

import java.util.*

class InputUtil {
    companion object {
        private val scanner = Scanner(System.`in`)

        fun inputInt(info: String): Int {
            print("$info : ")
            return scanner.nextInt()
        }

        fun inputString(info: String): String {
            print("$info : ")
            return scanner.nextLine()
        }
    }
}