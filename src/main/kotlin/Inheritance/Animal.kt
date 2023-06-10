package Inheritance

import jdk.jfr.Category

open class Animal constructor(private var animalName:String, private var animalCategory:String,private var animalSoundType:String ){

    private var name:String =this.animalName

    private var category:String =this.animalCategory
        private set

    private var sound:String =this.animalSoundType
        private set
    init {
        this.animalName =animalName
        this.animalCategory=animalCategory
        this.animalSoundType =animalSoundType
//        println("Initialized parent class")


    }
    public fun getAnimalName() =animalName
      public fun setAnimalName(animalName:String){
         this.animalName =animalName
     }
    public fun getAnimalCategory() =animalCategory
    public fun setAnimalCategory(animalCategory:String){
        this.animalCategory =animalCategory
    }
    public fun getAnimalSound() =animalSoundType
    public fun setAnimalSound(animalSound:String){
        this.animalSoundType =animalSound
    }

    open public fun showAnimal(){
        println("This animal is ${getAnimalName()}")
    }

}