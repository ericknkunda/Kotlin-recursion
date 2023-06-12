package DataClasses

sealed class SealedAnimal {
    class Dog:SealedAnimal()
    class Person:SealedAnimal()
    class elephant:SealedAnimal()
}
fun main(args:Array<String>){
    var sealedObj:SealedAnimal =SealedAnimal.Person()
    when(sealedObj){
        is SealedAnimal.Dog-> println("Dog is taken")
        is SealedAnimal.Person-> println("Person is taken")
        is SealedAnimal.elephant-> println("elephant is taken")
    }



}