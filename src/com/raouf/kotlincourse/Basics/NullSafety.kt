package com.raouf.kotlincourse.Basics

fun main(args: Array<String>) {
    var a:String?="a"
        a=null

//    println(a?.length)

//    val name= readLine()!!.toString()

    val c= if (a != null) a.length else -1
    val d= a?.length ?: -1
    println(c)
    println(d)
}