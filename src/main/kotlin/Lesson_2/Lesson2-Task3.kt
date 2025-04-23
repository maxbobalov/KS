package org.example.Lesson_2

const val SECONDS_IN_MINUTE = 60
fun main() {

   val timeTravel: Int = 457
   val hour: Byte = 9
   val minute: Byte = 39
   val time: Int = timeTravel + minute
   val timeHour: Int = hour + time / SECONDS_IN_MINUTE
   val timeMinute: Int = minute + time % SECONDS_IN_MINUTE

   println("Время прибытия поезда = ${timeHour}:${timeMinute}")

 }