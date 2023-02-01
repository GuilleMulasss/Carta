package Baraja

class Carta(Minumero: Int, mipalo: Char) {
    var numero=Minumero
        set(value) {
            if (value !in 1..13) {
                println("Numero de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }
    var palo=mipalo
        set(value) {
            //'C','P', 'R', 'T'
            val l = listOf<Char>('C', 'P', 'R', 'T')
            if (value !in l) {
                println("Palo de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }

        init {
            this.numero = numero
            this.palo = palo
        }

    constructor(otraCarta: Carta) : this(otraCarta.numero, otraCarta.palo) {
    }

    fun mostrarCarta() {
        var paloMostrar = ""
        var numeroMostrar = ""
        when {
            palo == 'C' -> paloMostrar = "Corazones"
            palo == 'P' -> paloMostrar = "Picas"
            palo == 'R' -> paloMostrar = "Rombos"
            palo == 'T' -> paloMostrar = "Trebol"
        }
        when {
            numero == 1 -> numeroMostrar = "As"
            numero in (2..10) -> numeroMostrar = numero.toString()
            numero == 11 -> numeroMostrar = "Jack"
            numero == 12 -> numeroMostrar = "Reina"
            numero == 13 -> numeroMostrar = "Rey"
        }
        println("$numeroMostrar de $paloMostrar.")
    }

    fun compararCarta(otraCarta : Carta) {
        /*
        var numero2 = this.numero
        var palo2 = this.palo*/
        if (this.numero > otraCarta.numero) {
            print("La carta mayor es: ")
            this.mostrarCarta()
        } else if (this.numero < otraCarta.numero) {
            print("La carta mayor es: ")
            otraCarta.mostrarCarta()
        } else {//número iguales
            if (this.palo > otraCarta.palo) {
                print("La carta mayor es: ")
                this.mostrarCarta()
            } else {
                print("La carta mayor es: ")
                otraCarta.mostrarCarta()
            }
        }
    }
}