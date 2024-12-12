package com.example.finalexampp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("MainActivity", "Application démarrée")
        Log.e("Database", "Erreur lors de l’initialisation de la base de données")
        foreachExampleForDebugging()
        val myList = listOf<Any>() // Example empty list
        debugEmptyList(myList)

    }
}

/**
 * Generate a random string of a given length.
 *
 * @param length The length of the string to generate.
 * @return A random string of the specified length.
 */
fun generateRandomString(length: Int): String {
    val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { kotlin.random.Random.nextInt(0, charPool.size) }
        .map(charPool::get)
        .joinToString("")
}

fun foreachExampleForDebugging() {
    val randomStrings = List(5) { generateRandomString(5) }
    var strVar: String = ""

    for (string in randomStrings) {
        strVar = string
        println(strVar)
    }
}

fun debugEmptyList(myList: List<Any>) {
    if (myList.isEmpty()) {
        Log.d("Debug", "The list is empty.")
    } else {
        for (item in myList) {
            Log.d("Debug", "Processing item: $item")
        }
    }
}

fun handleNullPointer(variable: Any?) {
    if (variable != null) {
        println("Variable is not null: $variable")
    } else {
        println("Variable is null")
    }
}

fun handleIndexOutOfBounds(myList: List<Any>, index: Int) {
    if (index < myList.size) {
        val item = myList[index]
        println("Item at index $index: $item")
    } else {
        println("Index $index is out of bounds for list of size ${myList.size}")
    }
}

