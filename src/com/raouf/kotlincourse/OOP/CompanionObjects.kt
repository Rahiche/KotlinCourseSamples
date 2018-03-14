package com.raouf.kotlincourse.OOP


class Rectangle{

    companion object myobj{
        fun Create():Rectangle=Rectangle()
        fun CalaArea(l:Int,W:Int){
            println("rectangle Surface Area is : ${l*W}")
        }
    }

}

fun main(args: Array<String>) {
    val myrec=Rectangle.Create()
}