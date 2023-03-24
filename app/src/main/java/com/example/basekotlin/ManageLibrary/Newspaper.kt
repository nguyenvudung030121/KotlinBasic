package com.example.basekotlin.ManageLibrary

class Newspaper(id: Int, nameOfRelease: String, mountRelease: Int, var monthRelease: String) :
    Document(
        id, nameOfRelease,
        mountRelease
    ) {

    override fun toString(): String {

        return "Document(id='$id', nameOfRelease='$nameOfRelease', numberRelease=$mountRelease, monthRelease='$monthRelease')"

    }
}