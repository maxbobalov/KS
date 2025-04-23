package org.example.Lesson2

fun main() {
    val percentBuff = 20
    val percentDivider = 100F
    val buf: Float = percentBuff / percentDivider

    val crystal: Int = 7
    val ironOre: Int = 11

    val resCrystal = crystal * buf
    val resIronOre = ironOre * buf

    println("Дополнительно кристаллической руды получено: ${String.format("%.0f", resCrystal)}")
    println("Дополнительно железной руды получено: ${String.format("%.0f", resIronOre)}")


}