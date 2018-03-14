package com.raouf.kotlincourse.OOP

open class Product(){
    var ID:String=""
    var Name:String=""
    var Price:String=""
    var Image:String=""
    open fun ShowDetail(){
        println("id $ID Name $Name")
    }
}
class Food():Product(){

}
class Phone():Product(){

    var RAM:String=""
    var CPU:String=""
    override fun ShowDetail(){
        println("id $ID Name $Name CPU $CPU")
    }
}
class Clothe():Product(){
    var Size:String=""
}

class Raouf:Any(){

}

fun main(args: Array<String>) {
    var f1=Food()
    f1.ShowDetail()
    var R1=Raouf()
    var P1=Phone()
    P1.ShowDetail()

}