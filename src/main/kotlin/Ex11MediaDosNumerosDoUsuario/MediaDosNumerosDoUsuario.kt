package Ex11MediaDosNumerosDoUsuario

fun main() {
    var numerosUser = arrayListOf<Int>()

    for (i in 1..15){
        println("Digite o número $i")
        numerosUser.add(readln().toIntOrNull() ?: 0)
    }

    println("A média dos números digitados resulta em ${numerosUser.sum()/numerosUser.size}.")
}
