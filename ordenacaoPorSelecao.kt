fun main() {
    //1- Ir adicionando o menor valor de um array em um novo array
    val arrayList = arrayListOf(2, 63, 66, 1, 12, 56, 93)

    println(sortArray(arrayList))
}

private fun sortArray(arrayList: ArrayList<Int>): ArrayList<Int> {
    val arrayListSorted = arrayListOf<Int>()
    for (i in 0 until arrayList.size) {
        val menorIndice = menorIndiceByArray(arrayList)
        arrayListSorted.add(arrayList[menorIndice])
        arrayList.removeAt(menorIndice)
    }

    return arrayListSorted
}

fun menorIndiceByArray(arratList: ArrayList<Int>): Int {
    var menorValor = arratList[0]
    var menorIndex = 0

    for (i in 0 until arratList.size) {
        if (menorValor > arratList[i]) {
            menorValor = arratList[i]
            menorIndex = i
        }
    }
    return menorIndex
}