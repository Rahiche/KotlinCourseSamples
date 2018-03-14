package com.raouf.kotlincourse.Functions

import com.sun.org.apache.bcel.internal.generic.LocalVariableGen

fun ShowNames(vararg names:String)
{
    for (name in names)
    {
        println(name)
    }
}

fun MultiplicationTable(vararg numbers:Int){

    for (number in numbers)
    {
        println("Number is $number : ")
        for (i in 1..9)
        {
            println(i*number)
        }
    }

}
fun main(args: Array<String>) {
//   ShowNames("Raouf","ali","Ahmed")
   MultiplicationTable(1,5,8,9)
}