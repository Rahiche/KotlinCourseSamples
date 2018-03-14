package com.raouf.kotlincourse.Functions

fun CheckName(Name:String):String
{
    val Students= arrayOf("raouf","ahmed","ali")

    if (Name in Students)
    {
        return "Yes $Name"
    } else
    {
        return "No"
    }
}
fun main(args: Array<String>) {
    val Result = CheckName(readLine()!!.toString())
    println(Result)
}