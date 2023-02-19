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

    // Exploring default values and compact functions
    println("Change water: ${shouldChnageWater((day))}")

}

fun getDirtySensorReading(): Int{
    val dirty = Random().nextInt(50);
    return dirty
}

fun swim(speed: String = "fast"){
    println("swimming $speed")
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

//fun shouldChnageWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
//    return when{
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else -> false
//    }
//}

fun shouldChnageWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}



fun main(args: Array<String>){

//    //Exploring the main() function
//    println("Hello, ${args[0]}")
//

//    //Learning why (almost) everything has a value
//    // Will assign kotlin.Unit
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    //    val  temperature = 10
//    //    val isHot = if (temperature > 50) true else false
//    //    println(isHot)
//
//    val  temperature = 10
//    val isHot = "The water temperture is ${if (temperature > 50) "to warm" else "OK"}."
//    println(isHot)

//    //Learning more about functions
//        feedTheFish()


    // Exploring default values and compact functions
    swim()
    swim("slow")
    swim(speed = "turtle-like")
    feedTheFish()

}