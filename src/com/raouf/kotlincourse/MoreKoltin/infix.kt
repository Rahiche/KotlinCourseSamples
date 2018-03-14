package com.raouf.kotlincourse.MoreKoltin

class phone(var name:String) {
     operator fun plus(P: phone): phone {
        return if (this.name== P.name){
            phone("You have 2 ${this.name}")
        } else
            phone("You have ${this.name} and ${P.name}")
    }
}

fun main(args: Array<String>) {
    val p1=phone("P9 Lite")
    val p2=phone("LG 20")
    val p3=phone("P9 Lite")
    println((p1 + p3).name)

}


