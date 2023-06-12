package Inheritance

 class ExtendAbstractClass:AbstractClassOfPerson() {
     override var personAges: Int =0

         get() = field //TODO("Not yet implemented") field
         set(value) {field =value}

     override  var personName:String=""

     init {
         this.personName =personName
         this.personAges =personAges
     }

     override fun setPersonAges() {
         TODO("Not yet implemented")
     }

     override fun getPersonAges() {
         TODO("Not yet implemented")
     }

 }
fun  main(args:Array<String>){
    val peronOne  =ExtendAbstractClass()
    peronOne.personName ="Eric"
    peronOne.printOnConsole()
}