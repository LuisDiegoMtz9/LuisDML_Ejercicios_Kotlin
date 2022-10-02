fun main() {
    val frase = "Espero aprobar esta materia lo antes posible" // Se crea la variable con la frase
    println(diccionario(frase)) //Se imprime un diccionario con las frases y el tamaño de longitud
}

fun diccionario(frase: String): Map<String, Int> { // Recibe la frase y retorna un diccionario
    val diccionario: MutableMap<String, Int> = mutableMapOf() // Se crea el diccionario
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray()) // Se identifican y se separan las frases gracias al split
    for (i in partes.indices) { // Se crea un for para recorrer todas las palabras
        diccionario[partes[i]] = partes[i].length // Se guarda en el diccionario el valor de la cadena
    }
    return diccionario // se retorna el diccionario
}