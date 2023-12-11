package decoratorpattern

fun main(arg: Array<String>) {
    val pizza = TomatoSauce(PlainPizza())

    println(pizza.getMDescription())
    println(pizza.getMPrice())
}