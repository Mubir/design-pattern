package strategypattern

class StrategySetup(val op: ArithmeticOperation) {

    fun execute(x: Int, y: Int) {
        println(" result:: ${op.operation(x, y)}")
    }
}