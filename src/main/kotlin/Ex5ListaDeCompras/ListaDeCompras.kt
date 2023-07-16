package Ex5ListaDeCompras

fun main() {
    var listaCompras = ArrayList<String?
            >()
    print("Informe a quantidade de itens que deseja adicionar: ")
    var quantidade = readln().toIntOrNull()

    while (quantidade == null){
        print("Quantidade inválida, digite novamente: ")
        quantidade = readln().toIntOrNull()
    }

    for (i in 0 until quantidade){
        println("Informe o produto: ")
        var produto = readlnOrNull() ?: null
        while (produto.isNullOrBlank()){
            println("Produto não pode ser vazio.")
            produto = readlnOrNull() ?: null
        }
        listaCompras.add(produto)
    }
    println("Sua lista de compras:")
    println(listaCompras)
}
