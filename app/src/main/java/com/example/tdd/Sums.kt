package com.example.tdd

object Sums {

    private val sumNumbers = listOf(2, 1)

    fun add(a:Int, b:Int):Boolean{

        if(a > b)
            return true
        if(a < b) return false
        if(a in  sumNumbers)
           return true
        if(b in sumNumbers)
           return true

        else return false

    }

}