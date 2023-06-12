package Inheritance

class ExtensionFunction {
    var exetensionString:String? =""

    public  fun printMtyVal(){
        println("This value is ${this.exetensionString}")
    }
}
fun main(args:Array<String>){
    val extendedVal =ExtensionFunction()
    extendedVal.setParamOne("Eric")
    extendedVal.askParam()
    extendedVal.printMtyVal()
}
fun ExtensionFunction.setParamOne(value:String){
    this.exetensionString =value
}

fun ExtensionFunction.askParam(){
    println("Insert Param value: ")
    var paramValue =readLine()
    this.exetensionString =paramValue

}