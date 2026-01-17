
class Rectangulo( private val base: Int,  private val altura: Int) {
    companion object {
        var contador = 0
    }
    private val id: Int

     override fun toString(): String {
        return "Rectángulo $id:"
    }
    fun calcularArea() {
        return println("El area del rectángulo $id es ${base * altura} ")
    }
    fun calcularPerimetro() {
        return println("El perimetro del rectángulo $id es ${2*(base + altura)} ")

    }
    init {
        require(base > 0 && altura > 0) {"Introduce un rectángulo válido"}
        contador++
        id = contador
    }
}

    fun main() {
        val r1 = Rectangulo(2, 5)
        val r2 = Rectangulo(3, 7)
        val r3 = Rectangulo(4, 5)

        println(r1)
        r1.calcularArea()
        r1.calcularPerimetro()
        println(r2)
        r2.calcularArea()
        r2.calcularPerimetro()
        println(r3)
        r3.calcularArea()
        r3.calcularPerimetro()

    }

