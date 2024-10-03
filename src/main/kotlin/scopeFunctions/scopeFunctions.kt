package scopeFunctions

import kotlin.math.pow

fun main(args: Array<String>){
    //Let

    val str: String? = "Kotlin";

    str?.let {println(it) } ?: println("Null");

    val result = str?.let { str.uppercase() } ?: println("Null");

    //Apply

    val task = Runnable { println("running") }
    val thread = Thread(task);
    thread.isDaemon = true;
    thread.name = "thread";
    thread.state;
    thread.start();

    val task2 = Runnable { println("running2") };
    val thread2 = Thread(task2);
    thread2.apply {
        this.name = "thread2";
        this.isDaemon = true;
        this.start();
    }


    //Repeat

    repeat(10) { println("kotlin") }

    //With

    val person = Person().apply {
        this.run();
        this.eat();
    }

    with(person) {
        name = "John";
        age = 18;
        run();
        eat();
        "Return statement"
    };

    //Run

    var result2 = person.run{
        run();
        "Person running.";
    }

    println(result2);

    //Also

    val address = Address().apply {
        street = "My Street";
        code = 123
    }

    val user = User(name = "Edmund", address = address);

    val result3 = user.also {
        it.age = 50;
        println("Logged ${it.name}");
    }

    //TakeIf

    val person2 = Person();
    val result4 = person2.takeIf { it is Person } ?: "not a person"; //return itself
    println(result4);

    //TakeUnless

    val person3 = Person();
    val result5 = person3.takeUnless { it is Person }; //return null
    println(result5);

    //Filter

    val list = (1..10).toList();

    val result6 = list.filter { (it%2) == 0 }

    println(result6);

    //Map

    val result7 = list.map{ it.toDouble().pow(2.0).toInt()}

    println(result7);

    //All

    val allPositive = list.all { it > 0 };
    println(if(allPositive) "All positive" else "Not positive");

    val allEven = list.all { it % 2 == 0 };
    println(if(allEven) "Even" else "Not even");

    //Any

    val list2 = (-1..10).toList();

    val hasNegative = list2.any { it < 0 };
    println(if(hasNegative) "Has" else "Not negative");

    //None

    val allPositive2 = list.none{ it < 0 };
    println(if(allPositive2) "All positive" else "Not positive");

    //Count

    val negativeCount = list2.count { it < 0 };
    println(negativeCount);

    //Find

    val list3 = listOf("C#", "Kotlin", "Java", "Python");

    val letter: Char = 'K';

    val result8 = list3.find {
        it.startsWith(letter)
    }

    println(result8);

}

class Person(var name: String? = null, var age: Int = 0){
    fun run() = println("run");
    fun eat() = println("eat");
}

data class Address(var street: String? = null, var code: Int? = null);
data class User(var name: String? = null, var address: Address? = null, var age: Int? = null);