package com.example.basekotlin.ManageCandidate

object GenerateID{
    var id:Int = 0
    fun autoGenerID():Int = ++id
}

fun main(){
    val candidateA = CandidateA(GenerateID.autoGenerID(),"Vu Dung"
        ,"Da Nang",2)

     val candidateB = CandidateB(GenerateID.autoGenerID(),"Duc An",
         "Hue",1)
    val candidateC = CandidateC(GenerateID.autoGenerID(),"Ha Lan",
        "Quang Binh",3)

    var manageCandidate = ManageCandidate()

    manageCandidate.addCandidate(candidateA)
    manageCandidate.addCandidate(candidateB)
    manageCandidate.addCandidate(candidateC)

    manageCandidate.showAllCandidate()

    println()

    manageCandidate.searchCandidateByID(4)
    manageCandidate.searchCandidateByID(2)
}