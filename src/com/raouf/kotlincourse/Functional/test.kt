package com.raouf.kotlincourse.Functional

import java.io.File

fun main(args: Array<String>) {
    val names =File("C:\\files\\names.txt").readLines()
            .filter { it.startsWith("m") }
            .take(10)
            .map { it.toUpperCase() }
            .forEach { println(it)}


//    val names1= mutableListOf<String>()
//    for (i in names){
//        if (i.startsWith("m")){
//            names1.add(i.toUpperCase())
//        }
//    }
//    for (i in names1){
//        println(i)
//    }

}
