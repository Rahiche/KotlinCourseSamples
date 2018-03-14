package com.raouf.kotlincourse.Functional

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    thread {  }
    thread {for (i in 1..100){
        println("from thread 1 $i")
    } }
    thread {     for (i in 1..10000){
    println("from thread 2 $i")
    } }
    thread {     for (i in 1..10){
    println("from thread 3 $i")
    } }


}