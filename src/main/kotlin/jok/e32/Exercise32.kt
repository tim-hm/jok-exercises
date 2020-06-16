package jok.e32

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V =
    { x -> f(g(x)) }

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun main() {
    val squareOfTriple = compose(::square, ::triple)

    println(squareOfTriple(2))
}
