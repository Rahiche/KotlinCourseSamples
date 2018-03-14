package com.raouf.kotlincourse.OOP.interfaces

class TScooter : SomeClassB(),IDrivable {
    override fun move() {
        println("Scooter is moving")

    }

    override fun stop() {
    }

    override fun SetSpeed() {
    }
}