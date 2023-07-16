package Ex12LinhaDoTempo

import kotlin.math.sign

fun main() {
    println("Qual o ano dos seu nascimento?: ")
    var anoUser = readln().toIntOrNull()

    while (anoUser == null){
        println("Ano inválido, digite novamente")
        anoUser = readln().toIntOrNull()
    }
    var idade = 0
    for (i in anoUser+1..2023){
        idade++
        println("O ano é $i e a sua idade é $idade")
    }
}
