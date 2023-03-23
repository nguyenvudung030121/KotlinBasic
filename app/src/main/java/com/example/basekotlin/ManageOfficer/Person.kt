package com.example.basekotlin.ManageOfficer

open class Person(val name:String, var age:Int, var gender:String, var addr:String) {
    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender', addr='$addr', "
    }
}