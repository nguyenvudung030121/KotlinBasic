package com.example.basekotlin.ManageLibrary

class Book(
    id: Int,
    nameOfRelease: String,
    mountRelease: Int,
    var numberRelease: Int,
    var dateRelease:String
) : Document(id, nameOfRelease, mountRelease) {

    override fun toString(): String {
        return "Document(id='$id', nameOfRelease='$nameOfRelease'," +
                " numberRelease=$mountRelease,numberRelease=$numberRelease, dateRelease='$dateRelease') "
    }
}