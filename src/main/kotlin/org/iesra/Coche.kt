package org.iesra

class Coche(var color: String, marca: String, modelo : String, numCaballos: Int, numPuertas: Int, matricula: String) {
    override fun toString(): String {
        return "${this.marca} ${this.modelo} ${this.color} de ${this.numCaballos} caballos, ${this.numPuertas} puertas y matrícula ${this.matricula} "
    }
val marca = marca
    get() = field.replaceFirstChar { it.uppercaseChar() }
    val modelo = modelo
    get() = field.replaceFirstChar { it.uppercaseChar() }
    val numCaballos = numCaballos
    val numPuertas = numPuertas
    val matricula = matricula

 init {
     require(matricula.length == 7) {
         "La matricula debe tener 7 caracteres"
     }
     require(numCaballos >= 70 && numCaballos <= 700) {
         "El número de caballos debe estar entre 70 y 700"
     }
     require(numPuertas >= 3 && numPuertas <= 5 ) {
         "El número de puertas debe estar entre 3 y 5 (incluidos)"
     }

 }
}
