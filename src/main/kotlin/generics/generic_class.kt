package generics

fun main(){
    var box_string = Box<String>();
    box_string.add("Hello");

    var box_int = Box<Int>();
    box_int.add(3);
}

class Box<T>(){
    var s: T? = null;

    fun add(s: T){
        this.s = s;
    }

    fun get(): T? = this.s;
}

class Producer<out T>(val value: T){
    fun produce() : T = value
}

class Consumer<in S>(){
    fun toString(value: S): String = value.toString();
}