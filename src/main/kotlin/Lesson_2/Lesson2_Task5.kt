package org.example.Lesson_2
import kotlin.math.*

fun main() {

    val mountsOnYears: Byte = 12

    val depositАmount = 70000
    val stavka: Float = 16.7F
    val stavka100: Float = stavka / 100

    val years: Byte = 20
    val months: Int = years * mountsOnYears

    val DepositRes = (depositАmount * (1 + stavka100 / mountsOnYears ).pow(n = months))

    println(String.format("%.4f",DepositRes))
}