package Inheritance

data class TostringClassProperty(var mandatoryParam:String) {
    var optionalParam:Int=0
    var stateIndicator:Double =0.0
    fun showParams():Unit{
        println("Mandatory param: ${this.mandatoryParam}\n" +
                "Optional param: ${this.optionalParam}\n" +
                "State param: ${this.stateIndicator}")
    }
}
fun main(args:Array<String>){
    val instanceOf =TostringClassProperty("Eric")
    println(instanceOf.toString())

}