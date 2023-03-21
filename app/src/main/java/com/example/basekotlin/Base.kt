package com.example.basekotlin

import java.util.*

fun main() {
    //PRINT

    /*
        \n Inserts a new line
        \t Inserts a tab
        \r Inserts a carriage return
        \' Inserts a single quote
        \" Inserts a double quote
        \\ Inserts a backslash
        \$ Inserts the dollar symbol
    */

    print("In khong xuong dong")
    println("In xuong dong")

    println("In voi gia tri cach 1:" + 5)

    /*data Type*/
    //Type Ctrl+Shift+P to show Type
//    Int       // Whole positive and negative numbers and zero
//    String    // Piece of text between quotes
//    IntRange  // Setting a range such as 1..6
//    Boolean   // Can only be true or false
//    Number

    //VAR use to declare Mutable Variable (Biến có thể thay đổi)
    var Datetodays = "21/03/2023"
    var Datetomorrow: String = "22/03/2023"
    println("In voi gia tri cach 2 $Datetodays")
    println("In voi gia tri cach 3 ${Datetomorrow}!")

    //VAL use to Assign once, cannot change.
    val age = "5"
    val name = "Rover"

    //MATH

    println("MATH CLASS: ")
    println(Math.round(13.7))
    println(Math.pow(2.0, 3.0))
    println(Math.min(6, 9))
    println(Math.max(10, 12))

    /*
    Mặc dù phạm vi của kiểu Long lớn hơn kiểu  Int,
    nhưng Kotlin không tự động chuyển đổi kiểu Int thành kiểu Long.

    Thay vào đó, bạn cần sử dụng hàm toLong() (để chuyển đổi sang kiểu Long).
     Kotlin làm như vậy để đảm bảo sự an toàn của kiểu dữ liệu, tránh những điều bất ngờ.

     */

    val number1: Int = 55
    val number2: Long = number1.toLong()

    /*
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()
     */

    //String
    println("String: ")

    val dog = "Toto"
    val state = "Kansas"
    val movie = "The Wizard of Oz"


    // Write your code below 🧙
    println(dog + ", I've a feeling we're not in " + state + " anymore. - " + movie + ", 1939")

    println(movie.length)
    println(dog.capitalize())


    //USER INPUT

    /*The readLine() function in Kotlin is used to tell the program to pause
        until some type of input is given by the user.
        Once the Enter key is pressed, anything typed into the console is returned by the readLine()
        function as a String.
        We can then save the input to a variable.
     */

    print("Enter text: ")
    val stringInput = readLine()
    println("You entered: $stringInput")

    //Input theo kieu gia tri

    // Creates an instance which takes input from standard input (keyboard)
    println("Input theo kieu gia tri ")
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer: Int = reader.nextInt()

    println("You entered: $integer")


}