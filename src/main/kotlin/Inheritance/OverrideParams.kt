package Inheritance

open class OverrideParams{
    var pcName:String ="Hewlett-Packard"
    var pcBrand:String ="HP"

    constructor(){
    }
    init {
        this.pcName ="Lenovo Thinkpad"
        this.pcBrand ="Lenovo"
    }
    open public fun showParams() {
        println("PC Name: ${this.pcBrand}\nPC brand ${this.pcName}")
    }
}
class extendOverridenParams:OverrideParams(){
//    var pcName:String
    init {
        this.pcName =pcName
        this.pcBrand=pcBrand
    }

    override public fun showParams() {
        println("PC Name: ${this.pcBrand}\nPC brand ${this.pcName}")
    }
}

fun  main(args:Array<String>){
    val extendedParams =extendOverridenParams();
    extendedParams.showParams()

//    println()
//    val OverridenParams =OverrideParams()
//    OverridenParams.showParams()
}