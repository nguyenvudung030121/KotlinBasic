package com.example.basekotlin.ManageOfficer

class Employee(name: String, age: Int, gender: String, addr: String, var work: String) :
    Person(name, age, gender, addr) {
    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender', addr='$addr', work='$work')"
    }
}