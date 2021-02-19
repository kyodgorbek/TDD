package com.example.tdd.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
val name:String,
val amount:Int,
var price:Float,
var imgUrl:String,
@PrimaryKey(autoGenerate = true)
val id:Int? = null

) {


}