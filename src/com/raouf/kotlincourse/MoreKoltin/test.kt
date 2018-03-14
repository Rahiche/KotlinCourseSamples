package com.raouf.kotlincourse.MoreKoltin

import kotlin.math.pow
import kotlin.math.sqrt

class my2D(var x:Double=0.0,var y:Double=0.0) {

     infix fun GetDistanceFrom(o:my2D):Double{
        return sqrt((o.x-x).pow(2) +(o.y-y).pow(2))
    }

    operator fun plus(c: my2D): my2D {
        var newc=my2D(c.x+x,c.y+y)
       return newc
    }

    override fun toString(): String {
        return "$x and $y"
    }
}











fun main(args: Array<String>) {
    val c1=my2D(1.0,2.0)
    val c2=my2D(5.0,10.0)
    println(c2 GetDistanceFrom c1 )
    println(c1+c2)
}


