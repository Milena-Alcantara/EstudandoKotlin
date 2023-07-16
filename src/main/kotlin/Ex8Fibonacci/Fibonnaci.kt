package Ex8Fibonacci

fun main() {
    println("Qual número da sequência de Fibonacci você deseja visualizar? ")
    var num = readln().toIntOrNull()

    while (num == null){
        println("Informe um número válido.")
        num = readln().toIntOrNull()
    }

    var fibonacci1 = 0
    var fibonacci2 = 1
    var fibonacciFinal= 0

    for (i in 1..num){
        fibonacciFinal = fibonacci1 + fibonacci2
        fibonacci2 = fibonacci1
        fibonacci1 = fibonacciFinal
    }
    println("Fib($num) = $fibonacciFinal")
}