class Libreria(Mititulo:String,Miautor:String,paginas:Int,Micalificacion:Int) {

    var titulo = Mititulo
    var autor = Miautor
    var paginas = paginas
        set(value) {
            if (value !in 0..10000){
                println("Numero de páginas incorrecto")
            }
            else{
                field = value
            }
        }
        get() {
            return field
        }

    var calificacion = Micalificacion
        set(value) {
            if (value !in -1..10) {
                println("Calificación invalida")
                pedirCalificacion()
            }
            else {
                field = value
            }
        }
        get() {
            return field
        }
    init {
        this.paginas = paginas
        this.calificacion = calificacion
    }

    constructor(otroLibro: Libreria) : this(otroLibro.titulo, otroLibro.autor, otroLibro.paginas, otroLibro.calificacion)

    fun pedirCalificacion(): Int {
        while (true){
            println("Introduzca una calificación entre 1 y 10")
            val calificacion = readln().toInt()
            if (calificacion in -1..10){
                return calificacion
                }
            else {
                println("Calificación invalida")
            }
        }
    }

    fun mostrarLibro(){
        println("$titulo, escrito por $autor, tiene ${paginas} paginas y una calificación de $calificacion")
    }

    fun cambiarTitulo(){
        println("Introduzca el nuevo Título:")
        val nuevoTitulo = readln()
        this.titulo = nuevoTitulo
    }

    fun cambiarAutor(){
        println("Introduzca el nuevo Autor:")
        val nuevoAutor = readln()
        this.autor = nuevoAutor
    }
    fun cambiarPaginas(){
        println("Introduzca las nuevas Páginas:")
        val nuevaPaginas = readln().toInt()
        this.paginas = nuevaPaginas
    }
    fun cambiarCalificacion(){
        println("Introduzca la nueva Calificación:")
        val nuevaCalificacion = readln().toInt()
        this.calificacion = nuevaCalificacion
    }

    fun cambiarDatos(){
        println("Seleccioneque dato/s quiere cambiar:\n1:Título\n2:Autor\n3:Páginas\n4:Calificación")
        val seleccion = readln().toInt()
        when{
            seleccion == 1 -> cambiarTitulo()
            seleccion == 2 -> cambiarAutor()
            seleccion == 3 -> cambiarPaginas()
            seleccion == 4 -> cambiarCalificacion()
        }
        println("¿Quieres cambiar más datos? S/N")
        val SN = readln()
        if (SN == "S"){
            cambiarDatos()
        }
    }
}