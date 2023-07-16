package Ex4NumerosPares

fun main() {
    var numeros = IntArray(10)
    println("Informe 10 numeros: ")
    for (i in 0 until 10){
       numeros[i] =  readln().toIntOrNull() ?: 0
    }

    val numerosPares = numeros.filter { it % 2 == 0 }
    println("Os números pares são ${numerosPares.toString()}")
}