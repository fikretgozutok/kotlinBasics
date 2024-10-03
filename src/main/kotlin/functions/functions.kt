package functions

fun main(args: Array<String>){
    greetings();
    greetings();
    greetings();

    println(sum(5,2));
}

fun greetings() : Unit {
    println("Hello World");
}

fun greetings(name: String = ""): String {
    return "Hello World $name";
}

fun sum(x: Int, y: Int) = x+y;