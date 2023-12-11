package decoratorpattern

abstract class PizzaDecorator(private val pizza: Pizza) : Pizza {
    override fun getMPrice(): Double {
        return pizza.getMPrice()
    }

    override fun getMDescription(): String {
        return pizza.getMDescription()
    }
}