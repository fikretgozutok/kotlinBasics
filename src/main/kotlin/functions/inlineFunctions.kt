package functions

fun main(){
    val result = multiply(4,5) { x, y -> x * y };
    println(result);

    /*val result = 4 * 5;
    println(result);*/
}

inline fun multiply(x: Int, y: Int, func: (Int, Int) -> Int): Int {
    return func(x,y);
}