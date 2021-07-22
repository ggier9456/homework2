package com.boxes

import sun.security.util.Length

fun main(args:Array<String>) {
    val letter :String
    var length : Float
    var width : Float
    var height : Int
    var box3=Box3()
    var box5=Box5()
    println("plz choice Box : (A) Box3/(B) Box5")
    letter= readLine().toString()
    if (letter == "A"){
        println("plz enter object's length:")
        length= readLine()!!.toFloat()
        println("plz enter object's width:")
        width= readLine()!!.toFloat()
        println("plz enter object's height")
        height= readLine()!!.toInt()
        if (box3.validate(length,width,height)==true){
            println("Box3 OK!!")
        }
        else{
            println("Your object too big!!")
        }
    }
    else if(letter == "B"){
        println("plz enter object's length:")
        length= readLine()!!.toFloat()
        println("plz enter object's width:")
        width= readLine()!!.toFloat()
        println("plz enter object's height")
        height= readLine()!!.toInt()
        if (box5.validate(length,width,height)==true){
            println("Box5 OK!!")
        }
        else{
            println("Your object too big!!")
        }
    }
    else{
        println("plz enter A/B!!")
    }
}



class Box3(){
    var length : Float = 0.0f
    var width : Float = 0.0f
    var height : Int = 0
    fun validate(length: Float,width:Float,height:Int) : Boolean{
        return !(length>23||width>14||height>13)
    }

}

class Box5(){
    var length : Float = 0.0f
    var width : Float = 0.0f
    var height : Int = 0
    fun validate(length: Float,width:Float,height:Int) : Boolean{
        return !(length>39.5||width>27.5||height>23)
    }

}