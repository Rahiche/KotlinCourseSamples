package com.raouf.kotlincourse.Functions

fun Greet(Greeting:String="Hello", Name:String)
{
    println("$Greeting $Name")
}
fun double(Num:Int) = Num*2

fun main(args: Array<String>) {

    Greet(Name = "Raouf")
    println(double(5))
}