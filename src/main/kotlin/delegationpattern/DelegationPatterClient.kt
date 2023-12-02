package delegationpattern

fun main(arg:Array<String>){

    println("««««««««««««««««««««««« without delegation kt »»»»»»»»»»»»»»»»»»»»»»»")
    val withoutKtDelegate=WithoutKtDelegate(MathTeacher(),SixGrdStd())
    println(withoutKtDelegate.showTrName())
    println(withoutKtDelegate.showStdName())

    println("««««««««««««««««««««««« Default delegation kt »»»»»»»»»»»»»»»»»»»»»»»")

    val defaultDelegate=WithoutKtDelegate(MathTeacher(),SixGrdStd())
    println(defaultDelegate.showTrName())
    println(defaultDelegate.showStdName())
}