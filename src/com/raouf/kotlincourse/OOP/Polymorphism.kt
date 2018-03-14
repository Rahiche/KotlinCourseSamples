package com.raouf.kotlincourse.OOP
open class animal(val ID:Int) {
    fun GetID(){
        println("this Animal ID is : $ID")
    }
    open fun Talk() {
        println("Animal is talking")
    }
}
class dog(ID:Int): animal(ID) {
    override fun Talk() {
        println("bark")
    }
}
class Snake(ID:Int): animal(ID) {
    override fun Talk() {
        println("hiss")
    }
}
class Raven(ID:Int): animal(ID) {
    override fun Talk() {
        println("croak")
    }
}
fun testfunction(p: animal){
    p.Talk()
    p.GetID()
}

fun main(args: Array<String>) {
    val Zoo= arrayListOf<animal>()
    Zoo.add(Snake(1))
    Zoo.add(Snake(2))
    Zoo.add(dog(3))
    Zoo.add(Raven(4))
    for (an in Zoo){
        an.GetID()
        an.Talk()
    }
    testfunction(Snake(500))

}



