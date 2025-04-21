package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var seconds: Short = 6480
    var minute: Int = seconds/60
    var hour: Int = minute/60
    println("0${hour}:${minute % 60}:0${seconds % 60};")
}