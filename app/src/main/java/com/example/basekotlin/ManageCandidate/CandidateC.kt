package com.example.basekotlin.ManageCandidate

class CandidateC(id: Int, name: String, addr: String, prioty: Int) : Candidate(
    id, name, addr,
    prioty
) {

    object CandidateC{
        private val Van="Van"
        private val Su="Su"
        private val Dia="Dia"

        fun getCandidate():String = "$Van, $Su, $Dia "
    }

    override fun toString(): String {
        return "CandidateC(id=$id, name='$name', " +
                "addr='$addr', prioty=$prioty,khoi = ${CandidateC.getCandidate()})"
    }

}