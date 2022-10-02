import java.math.RoundingMode // Libreria para especificcar un comportamiento de redondeo
import java.text.DecimalFormat // Libreria para formatea números decimales

fun main() {
    val decimal = DecimalFormat("#.##") // Se crea la variable decimal y se le da formato
    decimal.roundingMode = RoundingMode.HALF_UP // Se establece el modo de redondeo que tendra
    val cesta = listOf(
        150.12 to 10.0, 90.5 to 11.0, 407.20 to 23.0, 232.0 to 5.0, 111.3 to 18.2
    ) // Se crea una lista que contiene el precio y el porcentaje
    println("El total de la cesta es: " + decimal.format(CestaTotal(cesta, { a, b -> descuento(a, b) }, { a -> iva(a) })))
    //Se manda llamara y se impriime lo que retorne el la función CestaTotal
}

fun descuento(precio: Double, porcentaje: Double) = precio - (precio * porcentaje / 100)
// La función descuento recibe dos valores de tipo double, el precio y el porcentaje, para obtener el descuento al precio
//se le resta lo que salga de multiplicar el precio por el porcentaje dividido entre 100

fun iva(precio: Double) = precio + (precio * 0.16)
// La función iva recibe el precio y para calcular el iva simplemente al precio se le suma el resultado que da entre
// multiplicar el precio por 0.16, ya que en mexico el iva es del 16%

fun CestaTotal(cesta: List<Pair<Double, Double>>, descuento: (Double, Double) -> Double, iva: (Double) -> Double): Double {
//La función CestaTotal recibe la lista de cesta y las funciones de descuento e iva con sus respectivos parametros
    var total = 0.0 // Se crea nuestra variable total que sera la que contendra el valor total de la cesta
    for (i in cesta.indices) {
        total += iva(descuento(cesta[i].first, cesta[i].second))
    }// Se crea un for que valla recorriendo todos los parametros que tiene la cesta y se va sumando los valores para dar
    // con el total de toda la lista
    return total // Se retorna la variable total que tiene el valor total de la cesta

}