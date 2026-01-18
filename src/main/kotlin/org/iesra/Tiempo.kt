package org.iesra

class Tiempo(hora: Int, min: Int = 0, seg: Int = 0) {
    override fun toString(): String {
        return "${this.hora}h ${this.min}m ${this.seg}s"
    }

    var seg = seg
        set(value) {
            var v = value
            if (value >= 60) {
                this.min += v / 60
                v %= 60
                field = v
            } else {
                field = value
            }
        }

    var min = min
        set(value) {
            var v = value
            if (value >= 60) {
                this.hora += v / 60
                v %= 60
                field = v
            } else {
                field = value
            }
        }
    var hora = hora
        set(value) {
            if (value > 0 && value < 24) {
                field = value
            }
            else {
                throw IllegalArgumentException("La hora supera las 24")
            }
        }


    fun incrementar(t: Tiempo): Boolean {
        val h0 = this.hora
        val m0 = this.min
        val s0 = this.seg
        this.seg += t.seg
        this.min += t.min
        this.hora += t.hora
        if (this.hora <= 23) {
            return true
        } else {
            this.hora = h0
            this.min = m0
            this.seg = s0
            return false
        }
    }

    fun decrementar(t: Tiempo): Boolean {
        val h0 = this.hora
        val m0 = this.min
        val s0 = this.seg
        this.seg -= t.seg
        this.min -= t.min
        this.hora -= t.hora
        if (this.hora >= 0) {
            return true
        } else {
            this.hora = h0
            this.min = m0
            this.seg = s0
            return false
        }
    }

    fun comparar(t: Tiempo): Int {
        if (t.seg == this.seg && this.min == t.min && this.hora == t.hora) {
            return 0
        } else if (t.seg > this.seg || t.min > this.min || t.hora > this.hora) {
            return -1
        } else {
            return 1
        }
    }

    fun copiar(): Tiempo {
        return Tiempo(this.hora, this.min, this.seg)
    }

    fun copiar(t: Tiempo): Tiempo {
        this.hora = t.hora
        this.min = t.min
        this.seg = t.seg
        return this
    }

    fun sumar(t: Tiempo): Tiempo? {
        val h0 = this.hora
        val m0 = this.min
        val s0 = this.seg
        this.hora += t.hora
        this.min += t.min
        this.seg += t.seg
        val resultado = Tiempo(this.hora, this.min, this.seg)
        this.hora = h0
        this.min = m0
        this.seg = s0
        if (resultado.hora <= 23) return resultado else return null
    }

    fun restar(t: Tiempo): Tiempo? {
        val h0 = this.hora
        val m0 = this.min
        val s0 = this.seg
        this.hora -= t.hora
        this.min -= t.min
        this.seg -= t.seg
        val resultado = Tiempo(this.hora, this.min, this.seg)
        this.hora = h0
        this.min = m0
        this.seg = s0
        if (resultado.hora >= 0) return resultado else return null
    }

    fun esMayorQue(t: Tiempo): Boolean {
        if (this.seg > t.seg || this.min > t.min || this.hora > t.hora) {
            return true
        } else {
            return false
        }


    }
    fun esMenorQue(t: Tiempo): Boolean {
        if (this.seg < t.seg || this.min < t.min || this.hora < t.hora) {
            return true
        } else {
            return false
        }
    }

    init {
        require(this.hora >= 0 && this.hora < 24)
        if (this.min >= 60) {
            this.hora += this.min / 60
            this.min %= 60

        }
        if (this.seg >= 60) {
            this.min = this.seg / 60
            this.seg %= 60

        }
    }
}