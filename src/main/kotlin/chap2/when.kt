package chap2

import chap2.ColorV2.*

// using different objects in when branches
fun mix(c1: ColorV2, c2: ColorV2) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

// when without an argument
fun mixOptimized(c1: ColorV2, c2: ColorV2) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main() {
    println(mix(BLUE, YELLOW))
    println(mixOptimized(BLUE, YELLOW))
}