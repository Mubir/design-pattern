package factorypattern

fun main(arg: Array<String>) {

    var passMe = readln().toString()
    val obj = when (passMe) {
        "s" -> ScienceStd()
        "b" -> BusinessStd()
        else -> null
    }

    obj?.let { println(obj.toString()) }
}