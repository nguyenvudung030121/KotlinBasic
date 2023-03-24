package com.example.basekotlin.ManageCandidate

class CandidateB(id: Int, name: String, addr: String, prioty: Int) : Candidate(
    id, name, addr,
    prioty
) {
    object CandidateB{
        private val Toan = "Toan"
        private val Van = "Van"
        private val Anh = "Anh"

        fun getCandidate():String = "$Toan, $Van, $Anh"

    }

    override fun toString(): String {
        return "CandidateB(id=$id, name='$name', " +
                "addr='$addr', prioty=$prioty,khoi = ${CandidateB.getCandidate()})"
    }

}