package com.raouf.kotlincourse.OOP.interfaces

class TCar:SomeClassA(),IDrivable {
    override fun move() {
       println("car is moving")
    }

    override fun stop() {
    }

    override fun SetSpeed() {

    }
}