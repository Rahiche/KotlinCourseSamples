package com.raouf.kotlincourse.Basics

fun main(args: Array<String>) {
    val MyRange = 20.downTo(1) step 5
    val MyRange2 = 10..100
    val MyRange3 = MyRange2.reversed()




    for (i in MyRange)
    {
        println(i)
    }
}