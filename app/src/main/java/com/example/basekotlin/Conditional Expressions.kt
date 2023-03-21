package com.example.basekotlin

fun main() {
    var age = 65

    if (age < 18) {
        println("You are considered a minor.")
    } else if (age < 60) {
        println("You are considered an adult.")
    } else {
        println("You are considered a senior.")
    }

    //LOGICAL OPERATOR

    var humid = true
    var raining = true
    var jacket = false
    var shorts = false
    var sunny = false

    println(!humid)
    // Prints: false

    println(jacket && raining)
    // Prints: true

    println(humid || raining)
    // Prints: true

    // true AND true
    println(humid && raining) //  true

    // true AND false
    println(humid && shorts) //  false

    // false AND true
    println(sunny && raining) //  false

    // false AND false
    println(shorts && sunny) // false


    /*
    Không giống như Java (hay nhiều ngôn ngữ lập trình khác),
    if có thể được sử dụng như một biểu thức trong Kotlin;
    nó trả về một giá trị.
     */

    val number = -10

    val result1 = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }

    val result2 = if (number > 0) "Positive number" else "Negative number"
    println(result2)

    val a = -9
    val b = -11

    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")


    ///WHEN (SWITCH CASE)



    val number1 = 12
    val number2 = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    //When trong biểu thức
    //Else được xem như là default trong switch case
    val result = when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> number1 / number2
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")

    //When nằm ngoài biểu thức
    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }

    //Gộp hai hoặc nhiều điều kiện trong nhánh bằng dấu phẩy
    val n = -1

    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }

    //Kiểm tra giá trị trong phạm vi.

    val aNumber = 100

    when (aNumber) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }

    //Kiểm tra xem một giá trị có nằm trong một kiểu dữ liệu nào đó không.
//    when (testNumber) {
//        is Int -> print(aNumber + 1)
//        is String -> print(aNumber.length + 1)
//        is IntArray -> print(aNumber.sum())
//    }
}