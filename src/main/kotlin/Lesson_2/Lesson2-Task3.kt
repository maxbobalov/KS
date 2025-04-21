package org.example.Lesson_2

fun main() {

   val hour: Byte = 9
   val minute: Byte = 39
   val time: Int = 457 + minute
   val timeHour: Int = hour + time / 60
   val timeMinute: Int = minute + time % 60

   println("Время прибытия поезда = ${timeHour}:${timeMinute}")

 }