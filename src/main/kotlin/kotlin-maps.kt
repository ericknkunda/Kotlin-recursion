fun main(args: Array<String>){
    val unMutableMap = mapOf<Int, String>(1 to "One",2 to "Two",3 to "Three")
    val mutableMapOfIntegers = mutableMapOf<Char, String>('M' to "Male", 'F' to "Female")
     val mutableMap =unMutableMap.toMutableMap()
    println("Immutable map we have is $unMutableMap")
    println("Mutable map is $mutableMapOfIntegers")

//    using hashmap tech
    val hashedMap =HashMap<Int, String>()
    hashedMap[1] ="First"
    hashedMap[2] ="second"
    println("Hashed map $hashedMap")


//    use pair of
    var pairedMap = mutableMapOf(Pair(1, "One"), Pair(2,"Two"), Pair(3,"Three"))
    println("Paired map is $pairedMap")

//    map properties
    println()
    println("Paired Map entries (key->value) ${pairedMap.entries}")
    println("Paired Map Keys  ${pairedMap.keys}")
    println("Paired Map values  ${pairedMap.values}")

//    iterate over a map collection
    val iterableMap =pairedMap.asIterable().iterator()
    while(iterableMap.hasNext()){
        println("Iterated elem is ${iterableMap.next()}")
    }
    val mapKeysAsIterables =pairedMap.keys.iterator()
    while (mapKeysAsIterables.hasNext()){
        val key =mapKeysAsIterables.next()
        val value =pairedMap[key]
        println("${key } == $value")
    }

//    loop by for loops
    println()
    for ((key, value) in pairedMap){
        println("This $key =$value")
    }
//for each
    println()
    pairedMap.forEach{
        key, value ->
        println("Each $key =$value")
    }

//    cointainsKey Vs containsValue
    println()
    if(pairedMap.containsKey(3)){
        if (pairedMap.containsValue("One")){
            println("Index 3 =${pairedMap.get(3)} and One are contained in the map")
        }
        else{
            println("Paired map has no such a thing like 1")
        }
    }else{
        println("No such key as 3")
    }

}