package com.example.recyclerview

//Declare variable di tiap id item
class CharacterModel(
    private val id: Int,
    private val name: String,
    private val deskripsi: String,
    private val image: Int
){
    fun getId() : Int{
        return id
    }

    fun getName(): String {
        return name
    }

    fun getDeskripsi(): String{
        return deskripsi
    }

    fun getImage() : Int{
        return image
    }
}