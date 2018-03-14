package com.raouf.kotlincourse.Basics

fun main(args: Array<String>) {
//    val s = readLine()
//    val b = false
//
//    val a = arrayOf("kotlin","delphi","php")
//
//    if (s in  a){
//        println("yes its Pl")
//    } else
//    {
//        println("no its not pl")
//    }
//
//    if (s == "kotlin" || b==true) {
//        println("yes")
//        println("its")
//        println("kotlin")
//    }
//    else {
//        println("no")
//        println("its")
//        println("not")
//        println("kotlin")
//    }


//    if (s != "kotlin") {
//        println("not kotlin")
//    }
//    else {
//        println("yes kotlin")
//    }

    val age = readLine()!!.toInt()
    val adult = if (age > 18) true else false

//    if (age > 18)
//        adult = true
//    else
//        adult= false

    println(adult)

}
