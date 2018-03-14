package com.raouf.kotlincourse.OOP
open class product(){
    fun test(){

    }
}
object Book:product(){
    var Title:String=""
    var Pages:Int=0
}


fun main(args: Array<String>) {
    Book.Title=""
    Book.test()
    val myobj = object{
        val AppName="My test Application"
    }
    myobj.AppName


}