package oop

fun main(){
    var car = Car("Blue", 255.0);
}

open class Vehicle(var color: String){

}


class Car(color: String, speed: Double) : Vehicle(color) {

}