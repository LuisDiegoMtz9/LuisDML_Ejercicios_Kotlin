import java.math.RoundingMode // Libreria para especificcar un comportamiento de redondeo
import java.text.DecimalFormat // Libreria para formatea números decimales
import kotlin.math.pow // Libreria para poder sacara la potencia
fun main() {

    val lista = listOf(10.0, 20.0, 30.0, 40.0) // Se crea la lista con los valores de entrada
    println((sumapor2(lista) { a -> sumaCuadrado(a) })) // Se imprime el resultado
}

fun sumaCuadrado(valor: Double) = valor + (valor.pow(2)) // Esta funcion suma el valor mas su cuadrado

fun sumapor2(valores: List<Double>, suma: (Double) -> Double): List<Double> { //La función recibe la lista y una función

    val lista = mutableListOf<Double>() // Se crea una lista mutable
    for (i in valores.indices) { // Se crea un for para recorrer todos los valores de la lista
        val decimal = DecimalFormat("#.##") // Se establece el formato
        decimal.roundingMode = RoundingMode.HALF_UP // Se establece el modo de redondeo
        lista.add(decimal.format(suma(valores[i]) + (valores[i])).toDouble()) // Se guarda en la lista la suma
    }

    return lista // se retorna la lista
}