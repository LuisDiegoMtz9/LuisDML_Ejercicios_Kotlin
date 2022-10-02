fun main() {
    val Carga: Map<String, Double> = mapOf(
        "programación" to 90.0, "matemáticas" to 60.0, "física" to 100.0, "ciencia" to 72.0
    )// Se crea una variable carga que contendra un mapa con las materias y la caliicación
    println(calif(Carga))// SE imprime el mapa con las materias y su desempeño
}

fun calif(carga: Map<String, Double>): Map<String, String> { // Recibe el mapa y devolvera un mapa con el desempeño
    val desempeño: MutableMap<String, String> = mutableMapOf() // SE crea el mapa donde estara el desempeño
    for ((i, j) in carga) { //  Se crea un for que recorrera el mapa
        val desempe = when (j) {
            in 0.0..69.0 -> "Desempeño insuficiente"
            in 70.0..74.0 -> "Suficiente"
            in 75.0..84.0 -> "Bueno"
            in 85.0..94.0 -> "Notable"
            in 95.0..100.0 -> "Excelente"
            else -> " "
        }
        // En la varibale desempe se guardara el desempeño que tiene la materia
        desempeño[i.uppercase()] = desempe // en el mapa desempeño se pone la materia e mayusculas gracias al uppercase
        // y se le agrega el desempeño que tuvo
    }
    return desempeño // Se retorna el mapa
}