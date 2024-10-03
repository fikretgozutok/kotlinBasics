package oop

abstract class Vehicle2{
    fun detail(){
        println("detail")
    }

    abstract fun startEngine();
}

class Ship: Vehicle2(){
    override fun startEngine() {
        println("startEngine");
    }
}