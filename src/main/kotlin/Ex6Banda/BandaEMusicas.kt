package Ex6Banda

fun main() {
    print("Qual sua banda preferida?: ")
    var banda = readln()
    if (banda.isNullOrBlank()){
        banda = "Desconhecido(a)"
    }
    var musicas = ArrayList<String>(3)
    println("Legal! Digite 3 músicas que você gosta dessa Banda: ")
    for (i in 0 until 3){
        var musica = readln()
        if (musica.isNullOrBlank()){
            musica = "Desconhecido(a)"
        }
        musicas.add(musica)
    }

    println("A sua banda preferiada é: $banda e as músicas que você curte são $musicas")

}
