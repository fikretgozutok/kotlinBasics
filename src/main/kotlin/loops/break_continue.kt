package loops

fun main(args: Array<String>){
    for(i in 0..10){
        if(i%2==1) continue;
        if(i == 6) break;
        println(i);
    }


//    Labelled Break&Continue

    outerLoop@ for(i in 1..3){
        println(i);
        innerLoop@ for(j in 1..5){
            if (i == 2) break@outerLoop;
            if (j == 3) break@innerLoop;
            println(j);
        }
    }
}