import java.math.RoundingMode // Libreria para especificcar un comportamiento de redondeo
import java.text.DecimalFormat // Libreria para formatea números decimales
import kotlin.math.pow // Libreria para poder sacar la potencia
import kotlin.math.sqrt //  Libreria para la raiz

fun main() {
    val vector = DecimalFormat("#.##") // Creamos la variable que tendra el formato de salida
    vector.roundingMode = RoundingMode.HALF_UP  // Se establece el modo de redondeo que tendra
    val valores = Pair(20.2, 42.4) // Creamos una variable con un par de valores
    println("El modulo del vector es: " + vector.format(modulo2D(valores))) // SE imprime el modulo del vector
}
fun modulo2D(vector: Pair<Double, Double>) = sqrt(vector.first.pow(2.0) + vector.second.pow(2.0))
//La función recibe los valores del vector y se hace la operación para obtener el modulo