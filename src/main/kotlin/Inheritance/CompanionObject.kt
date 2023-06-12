package Inheritance

class CompanionObject {
    companion object{
        public fun printMessage(){
            println("I am a factory method")
        }
    }
}

fun main(args:Array<String>){
    println(CompanionObject.printMessage())
}