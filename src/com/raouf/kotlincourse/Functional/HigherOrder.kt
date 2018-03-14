package com.raouf.kotlincourse.Functional

fun dowithNumbers(a:Int,b:Int,f:(Int,Int)->Int){
    println(f(a,b))
}
fun add(x:Int,y:Int): Int {
    return x+y
}
fun multi(x:Int,y:Int): Int {
    return x*y
}
fun playwithtext(s:String,f:(String)->String){
    println(f(s))
}

fun main(args: Array<String>) {
    playwithtext("Raouf"){it.reversed()}
    dowithNumbers(3,7){x,y->x*y}
}
