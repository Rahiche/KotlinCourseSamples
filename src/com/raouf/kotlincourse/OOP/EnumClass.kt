package com.raouf.kotlincourse.OOP
//Enum Class
enum class BaseColors(val ID:Int){
    RED(1){
        override fun toString(): String {
            return "Red Color"
        }
    },
    GREEN(700),
    Blue(50)
}

fun main(args: Array<String>) {
for (BC in BaseColors.values()){
    println(BC)
    println(BC.ordinal)
    println(BC.ID)

}
}