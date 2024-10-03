package oop

fun main(){
    val dog = Dog();

    dog.voice();


}

open class Animal(){
    open fun voice (){
        println("Default");
    }


}

class Dog : Animal(){
    override fun voice (){
        println("Bark");
    }
}

class Cat : Animal(){
    override fun voice (){
        println("Meow");
    }
}