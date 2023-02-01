package sisis

fun main(args: Array<String>) {
    println("Baraja.Carta numero 1:")
    val numero1 = readln().toInt()
    println("Palo de la carta 1:")
    val palo1 = readLine()!!.uppercase()!![0]
    val carta1 = Carta(numero1, palo1)
    carta1.mostrarCarta()

    val carta2= Carta(carta1)
    carta2.numero = 7
    carta2.palo = 'T'
    carta2.mostrarCarta()

    carta1.compararCarta(carta2)

    /*
    println("Baraja.Carta numero 2:")
    val numero2 = readln().toInt()
    val palo2 = readLine()!!.uppercase()!![0]
    val carta2 = Baraja.Carta(numero2)
    println(carta2.mostrarCarta(numero2, palo2))
    println(carta1.compararCarta(numero2, palo2))
    */

}
