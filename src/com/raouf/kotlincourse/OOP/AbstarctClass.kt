package com.raouf.kotlincourse.OOP

abstract class Employee{
    var WorkHours:Int=0
    abstract fun GetSalary()
}
class Manger:Employee(){
    override fun GetSalary() {
        println("The Manager Salary Is : ${WorkHours*50}")
    }
}

fun main(args: Array<String>) {
  val emp = Manger()
}