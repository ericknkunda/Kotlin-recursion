fun main(args: Array<String>) {
    println("Hello World!")
    println("Sum "+addTheNumbers(1,2))
    println("Power of 4 to 3 is "+onPowerOf(4,3))
    println("Tail recursion of 4 to 3 is "+tailOnPowerOf(4,3))
}
fun addTheNumbers(numberOne: Int, numberTwo:Int):Int{
    return (numberOne + numberTwo)
//    return sum
}

fun onPowerOf(number:Int, index:Int) :Int{

    println("Number "+number)
    if(index<=0){
        println("Base case reached")
        return 1;
    }
    println("next Number "+(index-1))
    var powerOf =number *onPowerOf(number, index-1)

    println(" $number power  $index is $powerOf")
    return  powerOf
}

fun tailOnPowerOf(numberOne:Int, numberTwo:Int, auxiliaryVariable:Int =1):Int{
    var powerOf =numberOne*auxiliaryVariable
    return if(numberTwo<=1){
        powerOf
    }
    else{
        tailOnPowerOf(numberOne, numberTwo-1, powerOf)
    }
}