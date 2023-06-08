import java.lang.NumberFormatException

fun main(){
    var myVal =compareToTen(10);
    var testResult =if(myVal=="Greater"){
        "We are in profit "
    }
    else{
        "We encountered loss"
    }

    println("Enter your ages ")
    var ages = readLine()
    var intAges:Int =0

    if(ages !=null){
        try{
            intAges =ages.toInt()
        }catch (e:NumberFormatException){
            e.printStackTrace()
        }
    }

    var categ =when(intAges){
        in 1..16->"youth"
        in 17..35->"Adult"
        in 36..120->"Old"
        else
            ->"Not ages"
    }

    println("Result is "+myVal)
    println(testResult)
    println("You Age Category is "+categ)

    outerLoop@ for(counter in 1..10){
        innerLoop@ for(index in 1..counter){
            print('*')
            if(index in 4..7){
               break@outerLoop;
            }
        }
        println()
    }
}
fun compareToTen(param:Int): String {
    return if (param<10){
        "Less"
    }
    else{
        "Greater"
    }
}