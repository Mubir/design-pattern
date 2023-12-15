package strategypattern

class Add : ArithmeticOperation {
    override fun operation(x: Int, y: Int): Int {
        return x + y
    }
}