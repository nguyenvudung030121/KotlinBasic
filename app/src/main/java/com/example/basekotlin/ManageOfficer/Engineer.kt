package com.example.basekotlin.ManageOfficer

class Engineer(name: String, age: Int, gender: String, addr: String, var major: String) :
    Person(name, age, gender, addr) {
    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender'" +
                ", addr='$addr', major='$major') "
    }
}