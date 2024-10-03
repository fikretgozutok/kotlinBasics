package oop

fun main(){
    var p = Person("John Doe", 22);

}

private class Person(var name: String, var age: Int) {
    init {
        println("Constructor!");
    }
}