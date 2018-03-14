package com.raouf.kotlincourse.OOP

class Person{
    private var name:String=""
    private var SN:String=""
    fun AddPerson(pname:String,psn:String){
        name=pname
        if (psn.startsWith("SN-")) {
            SN=psn
        } else
            SN="SN-" + psn
    }
    fun ShowPerson(){
        println("Name : $name SN : $SN")
    }

}

fun main(args: Array<String>) {
    val p1=Person()
    p1.AddPerson("Raouf","SN-000000")
    p1.ShowPerson()


}