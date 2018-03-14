package com.raouf.kotlincourse.Functional

data class ProgrammingLanguage(var Name:String)
class Developer() {
     lateinit var name:String
     lateinit var PL:List<ProgrammingLanguage>
    fun test(){}
    fun test1(){}
    fun test2(){}
    fun test3(){}
 }

fun main(args: Array<String>) {
//    apply
//    with
//    let
//    run
//    also

    var dev:Developer?=Developer().apply {
        name=""
        PL= listOf(ProgrammingLanguage("Kotlin"),
                   ProgrammingLanguage("Delphi"))
    }
    dev?.run {
        test2()
        test1()
    }
    dev.let {
        var myname:String=""
    }



}