package variables

fun main(args: Array<String>){
    var name = "Ahmet";
    println(name);

    name = "Mehmet";
    println(name);

    val age = 24;
    println(age);

//    age = 12;

    /*
    *Primitive Variables

        *Byte    -> 1byte
        *Short   -> 2byte
        *Int     -> 4byte
        *Long    -> 8byte
        *Double  -> 8byte
        *Float   -> 4byte
        *Char    -> 2byte
        *Boolean -> 1byte
        ------------------------------
    *String  -> Reference Variable
    * */


    var byteVal : Byte = 127;
    val unsignedByteVal : UByte = 255u;

    val shortVal : Short = 32767;

    val intVal : Int = 32768;

    val longVal : Long = 32769L;

    val doubleVal : Double = 32768.0;

    val floatVal : Float = 32768.0f;

    val charVal : Char = 'A';

    val booleanVal : Boolean = true;

    val stringVal : String = "Hello World";


    //Null-Variables

    val msg : String? = null;

    println(msg?:"Null Value");

    // ?: -> Elvis Operator

    println(msg?.length);
    println(msg!!.length);

}