package decoratorpattern

class ThreeCheesePizza : Pizza {
    private val des = "Mozzarella, Fontina, Parmesan Cheese Pizza"
    private val price = 10.9
    override fun getMPrice(): Double {
        return price
    }

    override fun getMDescription(): String {
        return des
    }
}