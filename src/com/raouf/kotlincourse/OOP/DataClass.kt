package com.raouf.kotlincourse.OOP

 data class Costumer(
    var FirstName:String="",
    var LastName:String="",
    var Phone:String=""){
 }


fun main(args: Array<String>) {
    val ctr1=Costumer("Raouf","Rahiche","555")
    println(ctr1)
    println(ctr1.hashCode())

    val ctr2=Costumer("Raouf","Rahiche","555")
    println(ctr2)
    println(ctr2.hashCode())

    println(ctr1==ctr2)
    val ctr3=ctr2.copy(Phone = "777")
    println(ctr3)
    println(ctr3.hashCode())


}