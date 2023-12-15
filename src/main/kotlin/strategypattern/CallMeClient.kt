package strategypattern

fun main(arg:Array<String>)
{
    val obj = StrategySetup(Add())
    obj.execute(12,9)

    val obj2 = StrategySetup(Subtruct())
    obj2.execute(12,9)

    val obj3 = StrategySetup(Multiply())
    obj3.execute(12,9)
}