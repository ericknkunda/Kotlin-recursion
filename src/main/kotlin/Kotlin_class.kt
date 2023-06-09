class Kotlin_class(var paramName:String,var paramAge:Int ) {
    private var paramHeight:Double=0.0
    private var paramMass:Int =0
    constructor():this("", 0){
        this.paramAge =20
        this.paramName ="Eric"
        this.paramHeight =0.0
        this.paramMass =0
    }
    public fun printParams(){
        println("name ${this.paramName} Age ${this.paramAge} \nHeight ${this.paramHeight} Mass ${this.paramMass}")
    }

}
fun main(args:Array<String>){
    val classObj =Kotlin_class()
    classObj.printParams()
}