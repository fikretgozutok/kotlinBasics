package asynchronousProgramming

import java.util.concurrent.atomic.AtomicInteger

var counter: Int = 0;

fun main(){
    val thread = Thread{
        for(i in 1..10){
            println("Thread is $i");
            Thread.sleep(500);
        }
    }

    val threadTask = Runnable{
        for(i in 1..20){
            println("Thread task is $i");
            Thread.sleep(250);
        }
    }

    val thread2 = Thread(threadTask);

    /*thread.start();
    thread2.start();*/

    /*for(i in 1..5){
        println("Main thread is $i");
        Thread.sleep(1000);
    }*/

    //Synchronize

    val lock = Any();

    val thread3 = Thread{
        for(i in 1..1000){
            synchronized(lock){
                counter++;
            }
        }
    }

    val thread4 = Thread{
        for (i in 1..1000) {
            synchronized(lock) {
                counter++
            }

        }
    }

    thread3.start();
    thread4.start();

    thread3.join();
    thread4.join();

    println(counter);

    /////Alternative

    val atomicCounter = AtomicInteger(0);

    val thread5 = Thread{
        for(i in 1..100){
            atomicCounter.getAndIncrement();
        }
    }

    val thread6 = Thread{
        for(i in 1..100){
            atomicCounter.getAndIncrement();
        }
    }

    thread5.start();
    thread6.start();
    thread5.join();
    thread6.join();

    println(atomicCounter.get());


}