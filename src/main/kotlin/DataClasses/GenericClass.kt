package DataClasses

 class GenericClass<T>(input:T) {

     init {
         println("Generic Value $input" )
     }
    fun doGetValue(){
//        println("Generiv value $input")
    }
}
fun main(args:Array<String>){
    val genericValue =GenericClass(20)
    val genericString =GenericClass("Eric")
}