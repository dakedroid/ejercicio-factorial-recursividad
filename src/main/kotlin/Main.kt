fun main() {
    // sumadorRecursivo(0, 100)
    //println(suma(10, 20))
    println(factorial(10f))
}

fun factorial(numero: Float): Float {
    if (numero > 1){
        return numero * factorial(numero - 1)
    } else {
        return numero
    }
}

fun suma(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

fun sumadorRecursivo(i: Int, n: Int) {

    var contador = i
    println("INICIO DEL SUMADOR")

    if (contador < n) {
        contador++
        sumadorRecursivo(contador, n)
    }

}


