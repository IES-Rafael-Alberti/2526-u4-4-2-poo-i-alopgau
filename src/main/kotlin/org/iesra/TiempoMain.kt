package org.iesra
fun pedirTiempo(): Tiempo {
    var valido = false
    var hora = 0
    var minuto = 0
    var segundo = 0
    while (!valido) {
    try {
    hora = readln().toInt()
        minuto = readln().toInt()
    segundo = readln().toInt()
        valido = true
    } catch (e: NumberFormatException) {
        println("Alguno de los datos introducidos no es un número")
        valido = false
    }
    }
    return Tiempo(hora,minuto,segundo)
}

fun main() {

    val tiempo1 = Tiempo(10, 30, 45)
    try {
    val tiempo2 = Tiempo(23,0,9000)
        println(tiempo2)
    } catch (e: IllegalArgumentException) {
        println("La hora supera las 24h")
    }
    val tiempo3 = Tiempo(8, 5, 0)
    if (!tiempo1.incrementar(pedirTiempo())) {
        println("La operación supera las 24h al sumar")
    } else {
        println(tiempo1)
    }
    if (!tiempo1.decrementar(pedirTiempo())) {
        println("La operación supera las 00h al restar")
    } else {
        println(tiempo1)
    }
    println(tiempo1.comparar(pedirTiempo()))
    val tiempo4 = tiempo3.copiar()
    tiempo3.copiar(tiempo1)
    println(tiempo4.sumar(pedirTiempo()))
    println(tiempo4.restar(pedirTiempo()))
    println(tiempo1.esMayorQue(tiempo4))
    println(tiempo1.esMenorQue(tiempo4))

}




