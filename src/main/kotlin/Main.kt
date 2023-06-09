fun main(args: Array<String>) {

    var square ={int1:Int, int2:Int->int1* int2}
    println("Lamda expression "+square(2,3))
    println("Sum "+addTheNumbers(1,2))
    println("Power of 4 to 3 is "+onPowerOf(4,3))
    println("Tail recursion of 4 to 3 is "+tailOnPowerOf(4,3) )
    println("Nobody function result "+noBodyFunction(10,20))
    var doThis =doThis()
    println("From higher order "+doThis(10, 20))
    println("Function Passed as param "+receiveAfunAsParam(6,2, ::noBodyFunction))
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
//tail functions
fun tailOnPowerOf(numberOne:Int, numberTwo:Int, auxiliaryVariable:Int =1):Int{
    var powerOf =numberOne*auxiliaryVariable
    return if(numberTwo<=1){
        powerOf
    }
    else{
        tailOnPowerOf(numberOne, numberTwo-1, powerOf)
    }
}

fun noBodyFunction(first:Int, second:Int):Int{
    return first*second
}

fun doThis():(Int, Int)->Int{
    return ::noBodyFunction
}

fun receiveAfunAsParam(numb1:Int, numb2:Int, inFunct:(Int, Int)->Int):Int{
    return inFunct(numb1, numb2)
}
