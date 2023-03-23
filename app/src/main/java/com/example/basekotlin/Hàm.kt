package com.example.basekotlin

fun main(){
    //Hàm không có đối số
    // Define the function.
    fun printHello () {
        println ("Hello Kotlin")
    }

// Call the function.
    printHello()

    //Hàm có đối số
    fun printBorder(border: String, timesToRepeat: Int) {
        repeat(timesToRepeat) {
            print(border)
        }
        println()
    }

    //Hàm trả về giá trị
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }

}