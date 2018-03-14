package com.raouf.kotlincourse.MoreKoltin

fun Int.testfun():Int{
    return this * 10
}

fun String.PlayWithText():String{
    var Mytext=""
    for (t in indices){
        if (t%2==0)
        {
            Mytext=Mytext+ this[t].toUpperCase()
        } else Mytext=Mytext+ this[t].toLowerCase()
    }
    return Mytext
}

fun main(args: Array<String>) {
    val test:String="hello everyone"
    val myint:Int=10


    println(myint.testfun())
}
