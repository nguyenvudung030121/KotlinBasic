package com.example.basekotlin.ManageLibrary

class Journal(
    id: Int,
    nameOfRelease: String,
    mountRelease: Int,
    var nameAuthor: String,
    var numberOfPage: Int
) : Document(
    id, nameOfRelease,
    mountRelease
) {
    override fun toString(): String {
        return "Document(id='$id', nameOfRelease='$nameOfRelease'" +
                ", numberRelease=$mountRelease, '$nameAuthor', numberOfPage=$numberOfPage) "
    }
}