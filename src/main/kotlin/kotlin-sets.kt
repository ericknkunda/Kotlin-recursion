fun main(args: Array<String>){
    val setOfImmutables = setOf<Int>(1,2,3,4,5,6,7,8,8)
    val setOfMutables = mutableSetOf<Int>(10,11,12,13,14,15,16,17,18,19,20)
    val setOfStrings = mutableSetOf<String>("Eric","Car", "Omar", "Goal", "Mom")

    println(" Set of Immutables $setOfImmutables")
    println("set of mutables $setOfMutables")

//    iterate via toString
    println()
    println("Looped by toString method ${setOfMutables.toString()}")

//    looping via iterable
    val iterableSet =setOfMutables.asIterable().iterator()
    while(iterableSet.hasNext()){
        println("Iterated elem is ${iterableSet.next()}")
    }

//    for each and for in
    println()
    for(elem in setOfMutables){
        println("Each elem in set is $elem")
    }
    println()
    setOfMutables.forEach{it
        println("Every looped elem is $it")

    }
println()
    for(value in setOfMutables.indices){
        println("At index $value is ${setOfMutables.elementAt(value)}")
//            println("Looped by each index: "+setOfMutables.elementAt(value))
    }
//in and contains
    println()
    if("Eric" in setOfStrings){
        if(setOfStrings.contains("Car")){
            println("Index of Eric id ${setOfStrings.indexOf("Eric")}")
            println("Element at 2 is ${setOfStrings.elementAt(2)}")
        }else{
            println("The list does not contain car")
        }
    }
    else{
        println("Eric is not the list")
    }
}