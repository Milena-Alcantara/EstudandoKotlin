package Ex9MenuDeOperacoes

import kotlin.system.exitProcess

fun main() {
    do {
        println("---------------------------------------------------------------------------------------------------")
        print("Informe o 1º número: ")
        val numero1 = readln().toIntOrNull() ?: 0
        print("Informe o 2º número: ")
        val numero2 = readln().toIntOrNull() ?: 0


        println("Informe a operação que seja realizar: \n\t1-Somar\n\t2-Subtrair\n\t3-Multiplicar\n\t4-Dividir\n\t5- Encerrar")
        var opc = readln().toIntOrNull() ?: 0

        when(opc){
            1-> println(" A soma resulta em ${numero1 +numero2}")
            2-> println(" A subtração resulta em ${numero1 - numero2}")
            3-> println(" A multiplicação resulta em ${numero1 * numero2}")
            4-> println(" A Divisão resulta em ${numero1 / numero2}")
            5 -> exitProcess(0)

            else -> println("Opção inválida.")
        }
    }while (opc !=5)

}


