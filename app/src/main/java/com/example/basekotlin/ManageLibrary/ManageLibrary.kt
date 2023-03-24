package com.example.basekotlin.ManageLibrary

class ManageLibrary {
    val listDocument:MutableList<Document> = mutableListOf()

    fun addDocument(doc:Document){
        listDocument.add(doc)
    }

    fun deleteDocumentById(id:Int){
        val doc = listDocument.firstOrNull() { document -> document.id == id }

        if (doc != null){
            listDocument.remove(doc)
        }else{
            println("Khong co Document de xoa !")
        }
    }

    fun showAllBook(){

    }



    fun listOfDocument(){
        listDocument.forEach(System.out::println)
    }

}