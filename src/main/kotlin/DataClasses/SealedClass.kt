package DataClasses

sealed class SealedClass {
    class FirstSeal:SealedClass()
            class SecondSeal:SealedClass()


}

fun main(args:Array<String>){
    var sealedObj:SealedClass =SealedClass.SecondSeal()
    when(sealedObj){
        is SealedClass.FirstSeal-> println("First sealed class")
        is SealedClass.SecondSeal-> println("Second Sealed")
    }
}