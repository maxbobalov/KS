package org.example.Lesson_1

fun main(){

 var seconds: Short = 6480
 var minute: Int = seconds/60
 var hour: Int = minute/60
 println("0${hour}:${minute % 60}:0${seconds % 60};")
 }