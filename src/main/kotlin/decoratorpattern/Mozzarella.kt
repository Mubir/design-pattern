package decoratorpattern

class Mozzarella(val pizza: Pizza) : PizzaDecorator(pizza) {
    override fun getMPrice(): Double {
        return super.getMPrice() + 1.1
    }

    override fun getMDescription(): String {
        return super.getMDescription() + " " + "Chotto Mozzarella plz"
    }
}