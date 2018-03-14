package com.raouf.kotlincourse.OOP.interfaces

fun testfun(p:IDrivable){
    p.move()
}
fun main(args: Array<String>) {
    var test:IDrivable
    test=TCar()
    test=TScooter()
    val newcar=TCar()
    testfun(newcar)
    val newTruck=TScooter()
    testfun(newTruck)
    testfun(test)
}