package collections

fun main(){
    val myHashMap = hashMapOf(1 to "one", 2 to "two", 3 to "three"); //HashMap
    val linkedHashMap = mutableMapOf(4 to "four", 5 to "five", 6 to "six"); //Linked HashMap

    myHashMap[4] = "four"
    myHashMap.put(5, "five");

    println(myHashMap);


}