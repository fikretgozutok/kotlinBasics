package generics

fun main(){
    printRepeated("hello", 3);
    printRepeated(10, 5);
}

fun <T> printRepeated(t: T, k: Int){
    for (items in 0..k) println(t);
}