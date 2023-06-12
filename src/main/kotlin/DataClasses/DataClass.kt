package DataClasses

data class DataClass(var bookName:String, var bookAthour:String, val numberOfPages:Int) {
}

class NonDataClass(var carIventer:String, var CarPrice:Double) {
    operator fun component1(): Any {
        return carIventer
    }

    operator fun component2(): Any {
        return CarPrice

    }
}

fun main(args:Array<String>){
    val Obj =DataClass("Maths", "Macintosh", 200)
    val carInstance =NonDataClass("Cal Max", 125.0)

    val copiedObjObj =Obj.copy(numberOfPages = 10)
    println("To string ${Obj.toString()} hash code ${Obj.hashCode()}")
    println()
    println("Copy $copiedObjObj hashcode ${copiedObjObj.hashCode()}")

    val (bookName, bookAthour, numberOfPages) =Obj
    println("Destructured Elems =>Name $bookName\n" +
            "=>Author $bookAthour\n" +
            "=>Pages $numberOfPages")

    if(Obj.equals(copiedObjObj)){
        println("Object are with the same hashCode ${Obj.hashCode()}")
    }
    else{
        println("Objects are different with ${Obj.hashCode()} and ${copiedObjObj.hashCode()} hashes")
    }

    val (_, bookAthours,_) =Obj
    println()
    println("Book authors $bookAthours")

    val(carInventer, carPrice) =carInstance
    println("Destructured Elems =>Inverter $carInventer\n" +
            "=>Price $carPrice\n" )

    println("String version ${carInstance.toString()}")
}