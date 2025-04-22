package org.example.Lesson_1

const val c = 60

fun main() {

    val seconds: Short = 6480
    val minute: Int = seconds / c
    val hour: Int = minute / c
    val resultMinute = String.format("%02d", minute % c)
    val resultSecond = String.format("%02d", seconds % c)
    val resultHour = String.format("%02d", hour)

    println("${resultHour}:${resultMinute}:${resultSecond};")

}