
class Persona(private var peso : Float, private var altura : Float) {
    companion object {
        var contador = 0
        fun obtenerDescIMC() {
            println("Si el IMC es menos de 18.5, se encuentra dentro del rango de peso insuficiente. Si el IMC está entre 18.5 y 24.9, se encuentra dentro del rango de peso saludable.  Si el IMC está entre 25.0 y 29.9, se encuentra dentro del rango de sobrepeso.   Si el IMC es 30.0 o superior, se encuentra dentro del rango de obesidad.")
        }
    }

    private var nombre = ""
    private var id = 0.toUByte()
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return this.altura == other.altura && this.peso == other.peso
    }
    fun mostrarPeso() {
        println("El peso de $nombre es $peso kg")
    }
    fun mostrarAltura(){
        println("La altura de $nombre es $altura m")
    }
    fun getAltura() = this.altura
    fun setNombre() {
        while (nombre.isEmpty()) {
        println("Introduce un nombre para la persona $id")
        this.nombre = readln()
            if (nombre.isEmpty()) {
                println("Introduce un nombre válido")
            }
        }
    }

    override fun toString(): String {
      return "Persona $id: (Peso: $peso kg Altura: $altura m)"
    }
    fun mostrarNombre() {
        println("Nombre: $nombre")
    }
    fun mostrarIMC() {
        println("El IMC de $nombre es $IMC")
    }
    fun setAltura(altura: Float) {
        this.altura = altura
    }
    fun saludar()  {
        println("Hola, soy $nombre")
    }

    fun alturaEncimaMedia(): Boolean {
        if (this.altura >= 1.75F) return true else return false
    }
    fun pesoEncimaMedia(): Boolean {
        if (this.altura >= 70F) return true else return false
    }

    fun obtenerDesc() {
        if (pesoEncimaMedia() && alturaEncimaMedia()) {
        println("$nombre con un peso de $peso kg (por encima de la media) y una altura de $altura m (por encima de la media) tiene un imc de $IMC (${obtenerDescImc()})")

        } else if (!pesoEncimaMedia() && alturaEncimaMedia()) {
            println("$nombre con un peso de $peso kg (por debajo de la media) y una altura de $altura m (por encima de la media) tiene un imc de $IMC (${obtenerDescImc()})")
        } else if (pesoEncimaMedia() && !alturaEncimaMedia()) {
            println("$nombre con un peso de $peso kg (por encima de la media) y una altura de $altura m (por debajo de la media) tiene un imc de $IMC (${obtenerDescImc()})")
        } else {
            println("$nombre con un peso de $peso kg (por debajo de la media) y una altura de $altura m (por debajo de la media) tiene un imc de $IMC (${obtenerDescImc()})")
        }
    }
    fun obtenerDescImc(): String {
    if (this.IMC < 18.5) {
        return "Peso insuficiente"
    } else if (this.IMC >= 18.5 && this.IMC <= 24.9) {
        return "Peso saludable"
    } else if (this.IMC >= 25.0 && this.IMC <= 29.9) {
        return "Sobrepeso"
    } else {
        return "Obesidad"
    }
    }

    private val IMC = peso/(altura*altura)
    constructor(peso : Float, altura : Float, nombre : String) : this(peso,altura) {
        this.nombre = nombre
    }

    init {
        contador += 1
        id = contador.toUByte()
    }

}
fun main() {
    val p1 = Persona(30.3F,1.52F)
    val p2 = Persona(60.8F,1.67F, "Álvaro")
    val p3 = Persona(60.8F, 1.8F, "Bernardo")
    p3.obtenerDesc()
    p1.setNombre()
    p1.mostrarNombre()
    p1.mostrarPeso()
    p1.mostrarAltura()
    p3.mostrarPeso()
    p3.mostrarAltura()
    p3.mostrarIMC()
    p3.setAltura(1.6F)
    p3.mostrarPeso()
    p3.mostrarAltura()
    p3.mostrarIMC()
    p2.setAltura(p3.getAltura())
    println(p2)
    println(p3)
    if (p2.equals(p3)) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }
}