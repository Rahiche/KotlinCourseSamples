package com.raouf.kotlincourse.OOP

class Student{
    var fname:String="raouf"
    var lname:String="rahiche"

    fun GetFullName(){
        println( "Full Name :  ${fname} ${lname}")
    }
}

fun main(args: Array<String>) {

    val S1 =Student()
    S1.GetFullName()
    val S2 =Student()
    S2.GetFullName()

}