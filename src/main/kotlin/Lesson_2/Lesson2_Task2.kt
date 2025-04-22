package org.example.Lesson_2

fun main(){
    val sumOldEmployees: Int = 50
    val sumNewEmployees: Int = 30
    val allEmployees: Int = 80

    val oneOldEmloyeesSalary: Float = 30000F
    val oneNewEmloyeesSalary: Float = 20000F

    val oldEployees: Float = sumOldEmployees * oneOldEmloyeesSalary
    val allSalary: Float = oldEployees + (sumNewEmployees * oneNewEmloyeesSalary)

    val Salary: Float = allSalary / allEmployees

    println("Расходы на выплату зарплаты постоянных сотрудников = ${oldEployees}")
    println("Общие расходы по ЗП после прихода стажеров = ${allSalary}")
    println("Средняя ЗП одного сотрудника после устройства стажеров = ${Salary}")
 }