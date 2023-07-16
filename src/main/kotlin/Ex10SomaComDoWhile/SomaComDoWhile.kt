package Ex10SomaComDoWhile

fun main() {
    var contador = 0
    var soma = 0
    do {
        soma += contador
        contador ++
    }while (contador<=15)
    println("A soma de todos os números de 1 á 15 resulta em $soma.")
}
