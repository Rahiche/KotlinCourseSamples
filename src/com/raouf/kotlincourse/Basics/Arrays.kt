package com.raouf.kotlincourse.Basics



fun main(args: Array<String>) {
    val p1 = "delphi"
     val p2 = "koltin"
    val p3 = "java"

    //هكذا تصتطيع اضافة تعليق جديد في سطر ما
    val PL = arrayOf("Delphi","kotlin","php")//و يمكن اضافة التعليق الى سطر اخر

    val numbers: Array<Int> = arrayOf(13,45,67,98,445)


    /*
    و يمكنك عمل
    تعليق
    متكون من عدة
    اسطر
     */
    val array: Array<Any> = arrayOf("delphi",34,true,'d')

    println(PL[1])
    PL[1] = "Go"
    println(PL[1])
    val  arr = Array(100,{454})

    arr[55] = 12345
    println(arr[55])

}