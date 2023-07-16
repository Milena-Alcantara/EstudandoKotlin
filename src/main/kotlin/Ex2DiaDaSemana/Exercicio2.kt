package Ex2DiaDaSemana

class DiadaSemana(var nome: String = ""){

        fun procurarDiaSemana(num: Int?){
            var listaDeDias = arrayListOf(
                DiadaSemana("Domingo"),
                DiadaSemana("Segunda"),
                DiadaSemana("Terça"),
                DiadaSemana("Quarta"),
                DiadaSemana("Quinta"),
                DiadaSemana("Sexta"),
                DiadaSemana("Sábado"),
            )
            for ((indice, valor)in listaDeDias.withIndex()){
                if (num == (indice+1)){
                    println("O dia correspondente é: ${valor.nome}")
                    return
                }
            }
        }
    }

fun main() {
    val objeto = DiadaSemana()

    println("Informe um número de 1 á 7: ")
    var numero = readln().toIntOrNull() ?: 0

    while (numero == 0 || !(numero in 1..7)){
        println("Número inválido, digide novamente.")
        numero = readln().toIntOrNull() ?: 0
    }


    objeto.procurarDiaSemana(numero)
}