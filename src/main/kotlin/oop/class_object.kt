package oop

fun main(){
    val lamp = Lamp();

    val lamp2 = Lamp();

}

class Lamp(){
    var isOn: Boolean = false;

    fun turnOn(){
        isOn = true;
    }

    fun turnOff(){
        isOn = false;
    }
}