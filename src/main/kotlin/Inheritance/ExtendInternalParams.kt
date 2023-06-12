package Inheritance

class ExtendInternalParams:InternalModifier() {
}
fun main(args:Array<String>){
    val extendedInsatanceOf =ExtendInternalParams()
    println("Extended param ${extendedInsatanceOf.stringFirld}")
}