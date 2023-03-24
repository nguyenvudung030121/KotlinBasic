package com.example.basekotlin.ManageLibrary

open class Document(val id:Int,var nameOfRelease:String, var mountRelease:Int) {

    override fun toString(): String {
        return "Document(id='$id', nameOfRelease='$nameOfRelease', numberRelease=$mountRelease, "
    }
}