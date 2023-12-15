package strategypattern

import kotlin.math.abs

class Subtruct : ArithmeticOperation {
    override fun operation(x: Int, y: Int): Int {
        return abs(x - y)
    }
}