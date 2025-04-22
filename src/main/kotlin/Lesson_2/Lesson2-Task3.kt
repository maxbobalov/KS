package org.example.Lesson_2

const val c = 60
fun main() {

   val timeTravel: Int = 457
   val hour: Byte = 9
   val minute: Byte = 39
   val time: Int = timeTravel + minute
   val timeHour: Int = hour + time / c
   val timeMinute: Int = minute + time % c

   println("Время прибытия поезда = ${timeHour}:${timeMinute}")

 }