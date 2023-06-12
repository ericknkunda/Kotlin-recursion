package Inheritance

open class AccessModifiers {
    private var privateModifierVar:String =""
    open protected  var protectedModifierVar:String =""
    open var publicModifierVar:String =""

    public fun getPrivateVar()=this.privateModifierVar
    public fun setPrivateVar(value:String){
        this.privateModifierVar =value
    }

    public fun setPublicVar(value: String){
        this.publicModifierVar =value
    }
}

class ExtendModifiers:AccessModifiers(){
    init {
        this.protectedModifierVar ="Macintosh"
    }

    public fun getProtectedVar()=this.protectedModifierVar
}

fun main(args:Array<String>){
    val privatedInstance =ExtendModifiers()
    privatedInstance.setPrivateVar("Eric")
    privatedInstance.setPublicVar("Nkunda")
    println(" Private property is ${privatedInstance.getPrivateVar()}\n" +
            " Protected var is ${privatedInstance.getProtectedVar()}\n" +
            " Public var is ${privatedInstance.publicModifierVar}")
}