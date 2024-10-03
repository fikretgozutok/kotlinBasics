package collections

fun main(){
    val list = List<Int>(3) {x -> x}

    list.forEach{x -> println(x)}


    val list2 = listOf(1,2,3);

    list2.forEach{x -> println(x)}
}