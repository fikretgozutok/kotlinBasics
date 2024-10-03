package functionalProgramming

val greeting = {println("Hello World!") }
val sum = { x: Int, y: Int -> x + y }

fun main(){
    greeting();
    println(sum(1, 2));
}

