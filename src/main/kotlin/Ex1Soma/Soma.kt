package Ex1Soma

fun main() {
    val numerosSomados = IntArray(5)

    for (i in 0..4){
        println("Informe um número: ")
        numerosSomados[i] = readln().toIntOrNull() ?: 0
    }

    println("O resultado da soma dos valores informados é ${numerosSomados.sum()}.")
}
