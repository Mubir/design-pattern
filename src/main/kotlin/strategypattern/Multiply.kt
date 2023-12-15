package strategypattern

class Multiply : ArithmeticOperation {
    override fun operation(x: Int, y: Int): Int {
        return x * y
    }
}