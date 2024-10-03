package operators

fun main(args: Array<String>){
    /*
    Operators are special tokens that represent computations
    like additions, multiplication and division. The values
    the operator works on are called operands
    */

    // Assignment Operator

    var n = 10;

    // Arithmetic Operator

    println(4+3);
    println(5-3);
    println(5*2);
    println(3/5);
    println(12%5);

    // Relational Operator

    val x = 5;
    val y = 3;

    println(x < y);
    println(x > y);
    println(x <= y);
    println(x >= y);
    println(x == y);
    println(x != y);

    // Conditional Operator

    var q = true;
    var t = false;

    println(q && t);
    println(q || t);


    // String Concatenation and Literal String

    var name = "Joe";
    val surname = "MAX";

    println(name + " " + surname); //String Concatenation

    println("$name $surname"); // Literal String - Template String


}