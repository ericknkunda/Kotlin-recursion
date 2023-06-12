package Inheritance

abstract class AbstractClassOfPerson {
    open var personName:String=""
    abstract  var personAges:Int

    abstract fun setPersonAges()
    abstract  fun getPersonAges()

    public  fun printOnConsole(){
        println(" Name ${this.personName}\n Ages: ${this.personAges}")
    }


}