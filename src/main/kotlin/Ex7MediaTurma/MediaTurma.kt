package Ex7MediaTurma

fun main() {
    print("Quantos alunos sua turma possui?: ")
    var quantidade  = readln().toIntOrNull()?: 0

    var notas = arrayListOf<Int>()
    while (quantidade == 0){
        println("Por favor, informa uma quantidade válida.")
        quantidade  = readln().toIntOrNull()?: 0
    }
    var contador = 0
    while (contador != quantidade){
        println("Informe a nota: ")
        notas.add(readln().toIntOrNull() ?:0)
        contador++
    }

    println("A média da turma é ${notas.sum()/notas.size}")
}