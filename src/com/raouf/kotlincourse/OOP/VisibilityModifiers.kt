package com.raouf.kotlincourse.OOP

//private
//+protected
//internal
//public

internal var MyName:String=""
fun MyFunction(){
}

open class MyClassA(){
    protected val myfirstname :String=""
}
class MYclassB():MyClassA(){
   fun test(){
     println(myfirstname)
   }
}

fun main(args: Array<String>) {
    val testing=MyClassA()
//    testing.myfirstname
}