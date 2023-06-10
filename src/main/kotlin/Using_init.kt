class Using_init constructor(var paramClassSize:Int, var paramSpec:String){
    init {
        this.paramSpec =paramSpec
        this.paramClassSize =paramClassSize
    }

    constructor(paramSpec: String, paramClassSize: Int):this(paramClassSize, paramSpec){

    }
    public  fun  describeObject(){
        println("Class name: ${this.paramSpec} \nClass Size: ${this.paramClassSize}")
    }
}
fun main(args:Array<String>){

//    call secondary constructor
    val instanceOfInit =Using_init("Pre_Primary", 20)

//    call primary constructor
    val instanceOfCons =Using_init(50, "History")
    instanceOfInit.describeObject()
    instanceOfCons.describeObject()
}