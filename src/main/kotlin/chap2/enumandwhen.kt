package chap2

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class ColorV2(
    val r: Int, val g: Int, val b: Int
) {
    // constant with property values
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    // define a method
    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: ColorV2) = when (color) {
    ColorV2.RED -> "Richard"
    ColorV2.ORANGE -> "Of"
    ColorV2.YELLOW -> "York"
    ColorV2.GREEN -> "Gave"
    ColorV2.BLUE -> "Battle"
    ColorV2.INDIGO -> "In"
    ColorV2.VIOLET -> "Vain"
}

fun getWarmth(color: ColorV2) = when (color) {
    ColorV2.RED, ColorV2.ORANGE, ColorV2.YELLOW -> "warm"
    ColorV2.GREEN -> "neutral"
    ColorV2.BLUE, ColorV2.INDIGO, ColorV2.VIOLET -> "cold"

}

fun main() {
    println(ColorV2.BLUE.rgb())
    println(getMnemonic(ColorV2.BLUE))
    println(getWarmth(ColorV2.ORANGE))
}