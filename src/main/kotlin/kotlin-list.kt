fun main(args:Array<String>){
    var listOfIntegers = listOf(1,2,3,4,5,6,7,8,9,10)
    var listOfStrings = mutableListOf("Eric", "Nkunda", "Emmy", "Macintosh")

//    print out the list
    println("List of Ints: "+listOfIntegers)
    println("List Of Str: "+listOfStrings)

//    change 'em to string
    println()
    println("Looped via toString(): "+listOfIntegers.toString())
    println("Looped via toString(): "+listOfStrings.toString())

//    looped through iterator
    println()
    var iterated =listOfIntegers.listIterator()
    while (iterated.hasNext()){
        println("The list elem "+iterated.next())
    }

//    loop by for in
    println()
    for(element in listOfIntegers){
        println("Looped by for each: "+element)
    }

//    looped by indexes
    println()
    for(counter in listOfIntegers.indices){
        println("Looped by each index: "+listOfIntegers[counter])
    }

//    use foreach higher-order function
    println()
    listOfIntegers.forEach {
        println(it+2)
    }

//    in tech
    println()
    if("Eric" in listOfStrings){
        println("Eric exists")
    }
    else{
        println("Eric does not exist ")
    }

//    contains tech
    if(listOfStrings.contains("Macintosh")){
        println("The List contains Macintosh")
    }
    else{
        println("List does not contain Macintosh")
    }

//    slicing a list
    println()
    var slicedList =listOfStrings.slice(1..3)
    println("Sliced list is "+slicedList)

//    add elems
    listOfStrings.add("")
    listOfStrings.add("null")

//    filtering a list
    println()
    val filteredList =listOfIntegers.filter { it > 0 }
    println("Filtered list is $filteredList")

//    group list elems
    val  otherListOfNumbers= mutableListOf<Int>(2,3,4,5,6,7,8,9,10)
    val stringWolds = mutableListOf<String>("Eric", "Mom", "car", "Goal")
    val groupedElems =otherListOfNumbers.groupBy { it%3 }
    val stringByLength =stringWolds.groupBy { it.length }
    println("Grouped list: $groupedElems")
    println("Grouped words: $stringByLength")

//    map function
    val mappedElems =otherListOfNumbers.map { if(it%2 ==0) it*it else it}
    println("Mapped collection $mappedElems")
}