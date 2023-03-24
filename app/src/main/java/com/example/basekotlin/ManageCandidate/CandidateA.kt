package com.example.basekotlin.ManageCandidate

class CandidateA(id: Int, name: String, addr: String, prioty: Int) :
    Candidate(
        id, name, addr,
        prioty
    ) {

    object CandidateA{
        val Toan = "Toan"
        val Ly = "Ly"
        val Hoa = "Hoa"
        fun getCandidate():String = "$Toan, $Ly, $Hoa"
    }

    override fun toString(): String {
        return "CandidateA(id=$id, name='$name', " +
                "addr='$addr', prioty=$prioty,khoi = ${CandidateA.getCandidate()})"
    }

}