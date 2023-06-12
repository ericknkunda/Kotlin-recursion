package Inheritance

open class InternalModifier {
     internal var stringFirld:String=""
    internal var intField:Int=0
}

//class TestInternalBehaviour{
//    stringFirld =
//}
fun main(args:Array<String>){
    val internalInstanceOf =InternalModifier()
    internalInstanceOf.stringFirld ="Mac1"
    internalInstanceOf.intField =120
    println(" Internal String ${internalInstanceOf.stringFirld}\n" +
            " Internal Integer ${internalInstanceOf.intField}")
}