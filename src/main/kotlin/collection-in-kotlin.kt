fun main(args:Array<String>){

    var arrayofInt:Array<Int> = arrayOf(1,2,3,4,5)
    var arrayOfString =Array<String>(5){"Hey"}
    for (elem in arrayofInt)
    println(elem)
    for (name in arrayOfString) println(name)
    println()
    var listOfNumbers = listOf<Int>(1,2,3,4,5,5,6,6,7,8)
    var listOfString = mutableListOf("eric", "Emmy", "Nkunda", "Macintosh")

    for (value in listOfString)
        println("Eleme: "+value)
    println(listOfString.get(1))
//    listOfNumbers.
    println("List we have is "+listOfNumbers)

}