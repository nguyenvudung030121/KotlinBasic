package com.example.basekotlin.ManageOfficer

fun main(){

    var listOfficer = ManageOfficer()

    val worker = Worker("VuDung",20,"M","Da Nang",10)
    val engineer = Engineer("HaLan",20,"F","Da Nang","IT")
    val employee = Employee("MaLai",20,"F","Da Nang","Cleaner")

    listOfficer.addOfficer(worker)
    listOfficer.addOfficer(engineer)
    listOfficer.addOfficer(employee)

    listOfficer.listOfOfficer()

    listOfficer.searchOfficerByName("VuDung")



}