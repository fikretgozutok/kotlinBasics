package loops

fun main(args: Array<String>){
    var counter : Int = 0;

    while(counter < 10) println(++counter);

    counter = 0;

    do{
        println("Code ran once.");
    }while(counter > 10);
}