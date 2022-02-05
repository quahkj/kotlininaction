package chap2

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main() {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}