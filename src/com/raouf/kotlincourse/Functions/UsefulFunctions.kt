package com.raouf.kotlincourse.Functions

fun main(args: Array<String>) {
    println("/////////")
    val i:Int=500
    println(i.inc())
    println(i.dec())
    println(i.inv())
    println(i.rangeTo(1000))
    println("/////////")
    val s:String = "Raouf "
    println(s.length)
    println(s.get(3))
    println(s[3])
    println(s.plus(i.rangeTo(100)))
    println(s.subSequence(1,s.lastIndex))
    println(s.indices)
    println(s.lastIndex)
    println(s.contains("ra",true))
    println(s.endsWith("f"))
    println(s.first())
    println(s.toUpperCase())

    println("/////////")
    val a: Array<String> = arrayOf("Raouf","Ali","Ahmed","Ali")
    println(a)
    println(a.asList())
    println(a.size)
    println(a.distinct())
    println(a.reversedArray().asList().distinct())
}