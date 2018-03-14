package com.raouf.kotlincourse.MoreKoltin

fun main(args: Array<String>) {

    val MyList = ArrayList<Int>()

    MyList.add(3)
    MyList.add(5)
    MyList.add(4)
    MyList.add(30)
    MySearch(MyList,10)

}

fun <T>MySearch(myList: ArrayList<T>, s: T) {
    if (s in myList){
        println("Yes found")
    } else
        println("Not found")
}




