package collections

/*
    Array : Mutable

    Collections
        Immutable (Read Only)
            -Immutable List -> listOf
            -Immutable Map -> mapOf
            -Immutable Set -> setOf
        Mutable (Read&Write)
            -Mutable List -> ArrayList, arrayListOf, mutableListOf
            -Mutable Map -> Hashmap, hashMapOf, mutableMapOf
            -Mutable Set -> mutableSetOf, hashSetOf

*/

fun main(){
    var array = Array<Int>(5) {0};// All items are 0
    var array2 = arrayOf(1,2,3);

    println(array2[2]);
}