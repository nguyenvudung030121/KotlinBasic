package com.example.basekotlin

class BaseClass(val firstName: String, var age: Int) {

}

fun main(args: Array<String>) {

    val person1 = BaseClass("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}
//Hàm tạo chính có cú pháp bị ràng buộc và không thể chứa bất kỳ code.
//
//Để đặt code khởi tạo (không kể phần code để khởi tạo thuộc tính),
// ta sử dụng khối khởi tạo. Nó có tiền tố là từ khóa init.
// Hãy sửa đổi ví dụ trên với khối khởi tạo:

/*
Để phân biệt tham số hàm tạo và thuộc tính hàm tạo, người ta sử dụng các tên khác nhau (fName và firstName, personAge và age).
Ta thường hay sử dụng _firstName và _age thay vì dùng các tên hoàn toàn khác biệt cho các tham số hàm tạo.
Ví dụ:
 */

class Person(_fName: String, _personAge: Int) {
    val firstName: String
    var age: Int
    //OR
    // val firstName = fName.capitalize()
    // var age = personAge


    // initializer block
    init {
        firstName = _fName.capitalize()
        age = _personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}