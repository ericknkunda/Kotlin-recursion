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
}