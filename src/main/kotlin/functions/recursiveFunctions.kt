package functions

fun main(args: Array<String>){
    println(factorial(5));
}

fun factorial(n: Int): Int{
    return if (n == 1){
        1;
    }else{
        n * factorial(n - 1);
    }
}