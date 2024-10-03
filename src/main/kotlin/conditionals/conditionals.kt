package conditionals

fun main(args: Array<String>){
    val number = 0;

    if(number > 0) {
        println("Positive");
    }
    else if(number < 0) {
        println("Negative");
    }
    else {
        println("Zero");
    }


    val result : Boolean = true;

    println(if (result) "YES" else "NO");


}