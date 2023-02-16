fun main(args: Array<String>){
    println("Hello, ${args[0]}")

    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

//    val  temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)

    val  temperature = 10
    val isHot = "The water temperture is ${if (temperature > 50) "to warm" else "OK"}."
    println(isHot)
}