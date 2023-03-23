package com.example.basekotlin.ManageOfficer

import java.io.PrintStream

class ManageOfficer() {

    var listOfficer: MutableList<Person> = mutableListOf()

    fun addOfficer(pr: Person) {
        listOfficer.add(pr)
    }

    fun searchOfficerByName(name: String){
        val officer = listOfficer.firstOrNull { it.name.equals(name) }
        println("MENAX -- "+officer)
    }

    fun listOfOfficer() {
        listOfficer.forEach(System.out::println)
    }
}

