package collections

fun main(){
    val hashSet = HashSet<Int>();
    hashSet.add(2);
    hashSet.add(2);
    hashSet.add(2);
    hashSet.add(2);
    hashSet.add(2);

    println(hashSet.size);

    hashSet.forEach(::println);
}