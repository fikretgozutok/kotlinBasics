package asynchronousProgramming

fun main(args: Array<String>){
    println("Other operations start");

    readFromFile { data -> println(data) }

    println("Operations go on");
}

fun readFromFile(callback: (String) -> Unit){
    Thread{
        Thread.sleep(2000);
        callback("Hello World!");
    }.start();

}