package decoratorpattern

class PlainPizza : Pizza {
    override fun getMPrice(): Double {
        return 4.6
    }

    override fun getMDescription(): String {
        return "plainPizza : "
    }
}