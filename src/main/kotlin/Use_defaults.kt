class Use_defaults constructor(var paramNames:String?, var paramAges:Int, var paramHeight:Double=0.62) {

//    init values
    init {
        this.paramAges =paramAges
        this.paramNames =paramNames
        this.paramHeight =paramHeight
    }

//    constructor(paramNames: String, paramAges: Int):this(paramNames, paramAges, 10.0){
////        body
//    }


    constructor():this(null, 0, 0.0){
        println("You name is $paramNames \nYou are $paramAges years old\nYour height is $paramHeight")

    }


    public fun exposeAnInstanceOf(){
        println("You name is $paramNames \nYou are $paramAges years old\nYour height is $paramHeight")
        println("You name is $this.paramNames \nYou are $this.paramAges years old\nYour height is $this.paramHeight")
    }
}


fun main(args:Array<String>){

//    zero params constructor
    val instanceOf =Use_defaults()

//    parametrized constructor
    println()
    val instanceOfCons =Use_defaults("Eric", 20)
    instanceOfCons.exposeAnInstanceOf()

//    primary cons with default
    println()
    val instanceOfPrim =Use_defaults("Emmy", 30)
    instanceOfPrim.exposeAnInstanceOf()

//    primary cons without default
    println()
    val instanceOfNonDefault =Use_defaults("Henry", 1, 1.00)
    instanceOfNonDefault.exposeAnInstanceOf()
}