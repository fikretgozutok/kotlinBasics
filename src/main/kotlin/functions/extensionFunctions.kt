package functions

fun main(args: Array<String>){
//    println(triple(2));

    println(2.triple());
}

//fun triple(number: Int): Int = number * 3;

fun Int.triple() = this * 3;