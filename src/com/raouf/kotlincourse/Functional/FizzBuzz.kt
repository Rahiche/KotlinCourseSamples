package com.raouf.kotlincourse.Functional

fun main(args: Array<String>) {
    val nums = mutableListOf<Int>()
    for (i in 1..100){
        nums.add(i)
    }
    val fizz = nums.filter { it%3==0 }
    val buzz = nums.filter { it%5==0 }
    println(fizz)
    println(buzz)


//
//    for (i in nums){
//        if (i%3==0){
//            fizz.add(i)
//        }
//    }
//    for (i in nums){
//        if (i%5==0){
//            buzz.add(i)
//        }
//    }

}

