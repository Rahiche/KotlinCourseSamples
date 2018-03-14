package com.raouf.kotlincourse.Basics

fun main(args: Array<String>) {
    println("write a : ")
    val a = readLine()!!.toInt()
    println("write b : ")
    val b = readLine()!!.toInt()

    println("what you want to do")
    val operator= readLine()!!.toString()

//    if (operator=="+")
//    {
//        println(a+b)
//    } else
//    if (operator=="-")
//    {
//        println(a-b)
//    } else
//    if (operator=="*")
//    {
//        println(a*b)
//    } else
//    if (operator=="/")
//    {
//        println(a/b)
//    }
//    when (operator)
//    {
//        "+","plus" -> println(a+b)
//        "-" -> println(a-b)
//        "*" -> println(a*b)
//        "/" -> println(a/b)
//    }


    val result =when (operator)
    {
        "+","plus" -> (a+b)
        "-" -> (a-b)
        "*" -> (a*b)
        "/" -> (a/b)
        else -> "No"
    }
    println(result)


}