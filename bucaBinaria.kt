fun main() {
    val myList = addQntyNumbers(1000000)
    val target = 1000000 - 1 // Número em que desejo procurar na minha lista
    println(pesuisaBinaria(myList, target))
}


fun addQntyNumbers(qnty: Long): MutableList<Int> {
    val listaGrande = mutableListOf<Int>()
    var contador = 0
    while (contador < qnty) {
        listaGrande.add(contador)
        contador++
    }
    return listaGrande
}

fun buscaLinear(list: List<Int>, item: Int): Int? {

    var contador = 0
    while (contador <= list.size) {
        if (list[contador] == item) {
            return contador
        }
        contador++
    }
    return null
}

fun pesuisaBinaria(listaOrdenada: MutableList<Int>, item: Int): Int? {
    var primeiroIndice = 0
    var ultimoIndice = listaOrdenada.size - 1

    while (primeiroIndice <= ultimoIndice) {
        var meio = (primeiroIndice + ultimoIndice) / 2
        var valorDoMeio = listaOrdenada[meio]

        if (valorDoMeio == item) {
            return meio
        }

        if (valorDoMeio > item) {
            ultimoIndice = meio - 1
        }

        if (valorDoMeio < item) {
            primeiroIndice = meio + 1
        }

    }

    return null
}
