package oop.operatorOverloading

/*
    a++    -> a.inc()
    a--    -> a.dec()
    a + b  -> a.plus(b)
    a - b  -> a.minus(b)
    a * b  -> a.times(b)
    a / b  -> a.div(b)
    a % b  -> a.rem(b), a.mod(b) (deprecated)
    a..b   -> a.rangeTo(b)
 */

fun main(){
    var myInstance = MyClass();

    println(myInstance.a);

    myInstance++;

    println(myInstance.a);
}

class MyClass(var a: Int = 1){

    operator fun inc(): MyClass {
       this@MyClass.a+=1;
       return this;
   }
}