package com.raouf.kotlincourse.OOP

open class Shape(){
    var x:Int=0
    var y:Int=0
    init {
        draw()
    }
    open fun draw(){
        println("draw Shape")
    }
}
class Circle():Shape(){
    override fun draw(){
        println("draw circle")
    }
}
class Sqaure():Shape(){
    override fun draw(){
        println("draw Sqaure")
    }
}
fun main(args: Array<String>) {
    val s1=Shape()
    val c1=Circle()
    val SQ1=Sqaure()
}