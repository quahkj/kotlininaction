package chap2

// function with block body
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// function with expression body without return type (infer from body expression)
fun shortMax(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(1, 2))
    println(shortMax(3, 7))
}