package staticFacotoryMethod

fun main(array: Array<String>)
{
    println(ObjectProvider.objectLikeSingleTone.getName())
    println(ObjectProvider.getName())
}