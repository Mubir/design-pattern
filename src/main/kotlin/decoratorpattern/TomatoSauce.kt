package decoratorpattern

class TomatoSauce(val pizza: Pizza) : PizzaDecorator(pizza) {
    override fun getMPrice(): Double {
        return super.getMPrice() + 9.0
    }

    override fun getMDescription(): String {
        return super.getMDescription() + " " + "Sauce ektu dami"
    }
}