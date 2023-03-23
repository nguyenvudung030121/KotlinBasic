package com.example.basekotlin.ManageOfficer

class Worker(name: String, age: Int, gender: String, addr: String,var level:Int) :
    Person(name, age, gender, addr) {

    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender', addr='$addr',level='$level') "
    }

}