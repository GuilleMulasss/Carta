class Rectangulo{
    var base = 0
    var altura = 0


    fun area(): Int {
        return (base * altura / 2)
    }
    fun perimetro(): Int {
        return ((base * 2) + (altura * 2))
    }
    fun imprimir(){
        println("La base es $base")
        println("La altura es $altura")
        println("El area es ${area()}")
        println("El perimetro es ${perimetro()}")
    }
}