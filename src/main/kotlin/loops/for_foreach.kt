package loops

fun main(args: Array<String>) {
    for (i in 1..10 step 3) {
        println(i);
    }

    for(i in 1..5) println(i);

    for (i in 10 downTo 1 step 2) println(i);


    (0..100 step 5).forEach{
        println(it);
    }
}