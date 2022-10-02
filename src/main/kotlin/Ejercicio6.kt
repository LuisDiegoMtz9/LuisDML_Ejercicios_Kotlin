import java.util.* // Importamos la libreria util de java
fun main(args: Array<String>) {
    val valores: MutableList<Double> = ArrayList()
    valores.add(1.0)
    valores.add(2.0)
    valores.add(3.0)
    valores.add(4.0)
    valores.add(5.0)
    valores.add(6.0)
    valores.add(7.0)
    valores.add(8.0)
    valores.add(9.0)
    valores.add(10.0)
    valores.add(70.0)
    valores.add(98.0)
// Se crea una lista mutable que tendra 12 valores
 Collections.sort(valores) // Utilizamos Collections.sort() para ordenar los elementos presentes en la lista valores
    // en orden ascendente
    println("Los valores atípicos son: " + atipicos(valores)) //Se imprimen los valores atipicos
}
fun atipicos(valores: List<Double>): List<Double> { // Esta función recibe la lista de valores y devolvera una lista
    val atipico: MutableList<Double> = ArrayList()// Se guardaran los vaalores atípicos
    var Menor: List<Double> = ArrayList()
    var Mayor: List<Double> = ArrayList()
    if (valores.size % 2 == 0) {// Si el tamaño de la lista es par
        Menor = valores.subList(0, valores.size / 2)
        Mayor = valores.subList(valores.size / 2, valores.size)
    } else {
        Menor = valores.subList(0, valores.size / 2)
        Mayor = valores.subList(valores.size / 2 + 1, valores.size)
    }
    // Se asigna el valor de mayor y de menor
    val Mediamenor = Media(Menor) // Se asigna la media de menor
    println(Mediamenor) // Se imprime la media mayor
    val Mediamayor = Media(Mayor) // Se imprime la media mayor
    println(Mediamayor) // Se imprime la media mayor
    val Resta = Mediamayor - Mediamenor // Se guarda el valor de la diferencia entre la media mayor y la menor
    val infe = Mediamenor - 1.5 * Resta // Se establece el rango inferior para ser atípico
    val superi = Mediamayor + 1.5 * Resta // Se establece el rango superior para ser atípico
    for (i in valores.indices) {
        if (valores[i] < infe || valores[i] > superi) atipico.add(valores[i])
    }
    // Se recorre toda la lista para verificra un valor que este fuera del rango, si esta fuera del rango se guardara
    // en la lista de valores atipicos
    return atipico // Se retorna la lista con los valores atípicos
}

private fun Media(data: List<Double>): Double { // La funcion media calcula la media de los valores, recibe la lista de valores
    return if (data.size % 2 == 0) (data[data.size / 2] + data[data.size / 2 - 1]) / 2
    else data[data.size / 2]
}