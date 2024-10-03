package oop.enums

fun main(args: Array<String>){
    printDay(DayOfTheWeek.MONDAY);

    println(DayOfTheWeek.SUNDAY.name);
}

fun printDay(dayOfTheWeek: DayOfTheWeek){
    when(dayOfTheWeek){
        DayOfTheWeek.MONDAY -> println("Monday");
        DayOfTheWeek.TUESDAY -> println("Tuesday");
        DayOfTheWeek.WEDNESDAY -> println("Wednesday");
        DayOfTheWeek.THURSDAY -> println("Thursday");
        DayOfTheWeek.FRIDAY -> println("Friday");
        DayOfTheWeek.SATURDAY -> println("Saturday");
        DayOfTheWeek.SUNDAY -> println("Sunday");
    }
}

enum class DayOfTheWeek {
   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}