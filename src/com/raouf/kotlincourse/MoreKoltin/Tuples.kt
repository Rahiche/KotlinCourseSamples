package com.raouf.kotlincourse.MoreKoltin
fun GetNameAndAge(ID:Int):Pair<String,Int>{
    var mylist=ArrayList<Pair<String,Int>>()
    mylist.add(Pair("Raouf",18))
    mylist.add(Pair("ali",16))
    mylist.add(Pair("walid",17))
    mylist.add(Pair("nasser",27))
    return mylist[ID]
}
fun main(args: Array<String>) {
    var (name,Age)= GetNameAndAge(0)
    println("Name :$name and Age:$Age")

}