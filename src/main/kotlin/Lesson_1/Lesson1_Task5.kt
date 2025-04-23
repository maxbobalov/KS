package org.example.Lesson_1

const val TIME_SECOND = 60

fun main() {

    val seconds: Short = 6480
    val minutes: Int = seconds / TIME_SECOND
    val hours: Int = minutes / TIME_SECOND
    val resultMinutes = minutes % TIME_SECOND
    val resultSeconds = seconds % TIME_SECOND
    val resultHours =  hours

    println(("%02d:%02d:%02d".format(resultHours, resultMinutes, resultSeconds)))

}