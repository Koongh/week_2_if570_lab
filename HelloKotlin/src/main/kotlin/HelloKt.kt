import java.util.Random;
import java.util.*;

fun randomDay():String{
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

//fun fishFood (day: String): String{
//    var food = ""
//    when(day){
//        "Monday" -> food = "flakes"
//        "Tuesday" -> food = "pellets"
//        "Wednesday" -> food = "redworms"
//        "Thrusday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        "Saturday" -> food = "lettuce"
//        "Sunday" -> food = "plankton"
//    }
//
//    return food
//}

fun fishFood (day: String): String{
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thrusday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun main(args: Array<String>){
//    println("Hello, ${args[0]}")
//
//    // Will assign kotlin.Unit
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
////    val  temperature = 10
////    val isHot = if (temperature > 50) true else false
////    println(isHot)
//
//    val  temperature = 10
//    val isHot = "The water temperture is ${if (temperature > 50) "to warm" else "OK"}."
//    println(isHot)

    feedTheFish()
}