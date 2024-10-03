package oop

import javax.imageio.stream.MemoryCacheImageOutputStream

fun main(){
    println(Math.PI);
    println(Math.sum(1,2,3))

    MotorCycle.inspect();

    val mc = MotorCycle(300.0);
    mc.ride();
}

object Math{
    val PI: Double = 3.14159265358979;

    fun sum(vararg nums: Int): Int {
        var sum = 0;

        for (num in nums) {
            sum += num;
        }

        return sum;
    }
}

class MotorCycle(val maxSpeed: Double){
    companion object{
        val type: String = "MotorCycle";

        fun inspect(){
            println("MotorCycle inspected");
        }
    }

    fun ride(){
        println("MotorCycle ride");
    }
}