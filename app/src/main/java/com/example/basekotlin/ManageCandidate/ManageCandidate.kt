package com.example.basekotlin.ManageCandidate

class ManageCandidate {

    var listCandidate: MutableList<Candidate> = mutableListOf()

    fun addCandidate(candidate: Candidate) {
        listCandidate.add(candidate)
    }

    fun showAllCandidate() {
        listCandidate.forEach(System.out::println)
    }

    fun searchCandidateByID(id: Int) {
        var candidate = listCandidate.firstOrNull() { candidate -> candidate.id.equals(id) }

        if (candidate == null) {
            println("Not candidate existing !")
        } else {
            println(candidate)
        }

    }
}