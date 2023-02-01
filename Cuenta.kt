class Cuenta(NumCuenta:Int, SaldoDisponible:Int) {
    val NumCuenta = NumCuenta
    var SaldoDisponible = SaldoDisponible

    val datosCuenta = listOf(NumCuenta,SaldoDisponible)



    fun mostrarCuentaSaldo(){
        println("La cuenta ${datosCuenta[0]}, tiene ${datosCuenta[1]}€")
    }
    fun cambiarSaldo(){
        println("¿Desea hacer \n1 ingreso \n 2 retirada?")
        val seleccionSaldo = readln().toInt()
        if (seleccionSaldo == 1){
            println("Introduzca la cantidad que desea ingresar: ")
            val saldoActualizar = readln().toInt()
            SaldoDisponible += saldoActualizar
            println("Su saldo actual es: $SaldoDisponible")
        }
        else {
            println("Introduzca la cantidad que desea retirar: ")
            val saldoActualizar = readln().toInt()
            SaldoDisponible -= saldoActualizar
            println("Su saldo actual es: $SaldoDisponible")
        }
    }
}