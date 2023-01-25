fun main(args: Array<String>) {
    println("Título del libro")
    val titulo1 = readln()
    println("Autor del libro")
    val autor1 = readln()
    println("Páginas del libro")
    val paginas1 = readln().toInt()
    println("Calificación del libro")
    val calificacion1 = readln().toInt()
    val libro1 = Libreria(titulo1,autor1,paginas1,calificacion1)

    libro1.mostrarLibro()

    libro1.cambiarDatos()

    libro1.mostrarLibro()

}

