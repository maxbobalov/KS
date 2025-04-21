package org.example.Lesson_2

fun main(){
    val oldEployees: Int = 50 * 30000
    val allSalary: Int = oldEployees + (30 * 20000)
    val Salary: Float = allSalary / 80F

    println("Расходы на выплату зарплаты постоянных сотрудников = ${oldEployees}")
    println("Общие расходы по ЗП после прихода стажеров = ${allSalary}")
    println("Средняя ЗП одного сотрудника после устройства стажеров = ${Salary}")
 }