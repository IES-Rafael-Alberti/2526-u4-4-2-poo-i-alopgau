package org.iesra

fun main() {
    val c1 = Coche("Amarillo", "Seat", "Ibiza", 200,4, "1101GJB")
    try {
    val c2 = Coche("Amarillo", "Seat", "Panda", 200,6, "1101GJB")
        println(c2)
    } catch (e: IllegalArgumentException) {
        println("Número puertas inválido")
    }
    try {
        val c3 = Coche("Amarillo", "Seat", "Panda", 200,4, "1101GJBH")
        println(c3)
    } catch (e: IllegalArgumentException) {
        println("Matrícula inválida")
    }
    try {
        val c4 = Coche("Amarillo", "Seat", "Panda", 69,5, "1101GJB")
        println(c4)
    } catch (e: IllegalArgumentException) {
        println("Número caballos inválido")
    }

    try {
        val c5 = Coche("Amarillo", "Seat", "Panda", 701,5, "1101GJB")
        println(c5)
    } catch (e: IllegalArgumentException) {
        println("Número caballos inválido")
    }
    try {
        val c6 = Coche("Amarillo", "Seat", "Panda", 701,2, "1101GJB")
        println(c6)
    } catch (e: IllegalArgumentException) {
        println("Número puertas inválido")
    }

    println(c1)
}