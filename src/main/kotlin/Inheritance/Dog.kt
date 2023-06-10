package Inheritance

class Dog:Animal("", "", "") {

    init {
//        println("Initialized child class")
    }
//    override
    override fun showAnimal(){
        println("This is a ${getAnimalName()}")
    }

}
fun main(args:Array<String>) {

    val animalDog =Dog()
    animalDog.setAnimalName("Dog")
    animalDog.showAnimal()
}