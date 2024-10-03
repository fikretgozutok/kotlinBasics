package oop

fun main(){
    val c1 = Color("blue");
    val c2 = Color("blue");

    println(c1 == c2);
    println(c2.toString());

    val c3 = Color2("red");
    val c4 = Color2("red");

    println(c3 == c4);
    println(c4.toString());


}

class Color(name: String){
}

data class Color2(val name: String){}