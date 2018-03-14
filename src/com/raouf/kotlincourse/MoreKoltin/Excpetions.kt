package com.raouf.kotlincourse.MoreKoltin


fun MyDiv(a:Int,b:Int):Int{
    return a/b
}
object myownexp:Throwable(){
    override val message: String?
        get() = "my own mesg exp"
}

fun main(args: Array<String>) {
//    var A= readLine()!!.toInt()
//    var B= readLine()!!.toInt()
//    try {
//        println(MyDiv(A,B))
//    } catch (e:ArithmeticException){
//       println(e.message)
//    } finally {
//        println("Test")

    throw myownexp


}