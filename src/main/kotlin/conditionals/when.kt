package conditionals

fun main(args: Array<String>){
    var number = 1;

    when(number) {
        1 -> println("Number is 1");
        2 -> println("Number is 2");
        3 -> println("Number is 3");
        4 -> println("Number is 4");
        else -> println("None of the above");
    }

    var result = when(number){
        0,1 -> println("Number is 0 or 1");
        else -> println("None of the above");
    }

    when(number){
        in 1..10 -> println("Number is in 1..10");
        in 11..20 -> println("Number is in 11..20");
        !in 20..30 -> println("Number is not in 20..30");
        else -> println("None of the above");
    }
}