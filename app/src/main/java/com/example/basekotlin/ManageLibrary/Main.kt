package com.example.basekotlin.ManageLibrary


object GlobalState{
    private var value = 0;
    fun getNextInt(): Int = value++
}

fun main(){

    var listDocument = ManageLibrary()

    val book = Book(GlobalState.getNextInt(),"Kim Dong",
        20,123,"23/03/2023")

    val journal = Journal(GlobalState.getNextInt(),"Hai Chau",120,
                            "Vu Dung",200)

    val newspaper = Newspaper(GlobalState.getNextInt(),"Da Nang",34,
                                "March")



    listDocument.addDocument(book)
    listDocument.addDocument(journal)
    listDocument.addDocument(newspaper)

    listDocument.listOfDocument()
    println()

    listDocument.deleteDocumentById(1)
    listDocument.listOfDocument()





}