package com.raouf.kotlincourse.OOP


class Car(var Model:String,var Color:String,var Price:Int){
    init {
        Model=Model.toUpperCase()
        Color=Color.toUpperCase()
    }

    fun GetDetail(){
        println("model:$Model Color:$Color Price:$Price")
    }
}
fun main(args: Array<String>) {
    val c1=Car("kia","red",1500)
    c1.GetDetail()
    val c2=Car("kia","blue",5500)
    c2.GetDetail()
 }