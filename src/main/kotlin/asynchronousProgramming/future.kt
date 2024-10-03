package asynchronousProgramming

import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun main(){
    val executor = Executors.newSingleThreadExecutor();

    val future = executor.submit(Callable {
        println("This operation take a while");
        Thread.sleep(1000);
        "Done!";
    })

    println("Operations started!");

    future.get();

    println("Operations stopped!");

    executor.shutdown();
}