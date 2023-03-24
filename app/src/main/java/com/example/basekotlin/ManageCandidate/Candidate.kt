package com.example.basekotlin.ManageCandidate

open class Candidate(val id:Int,var name:String, var addr:String, var prioty:Int) {

    override fun toString(): String {
        return "Candidate(id=$id, name='$name', addr='$addr', prioty=$prioty)"
    }
}