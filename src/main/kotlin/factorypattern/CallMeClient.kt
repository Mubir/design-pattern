package factorypattern

fun main(array: Array<String>) {
    val circle = ObjectCreator().createObj(FigureFactory.Type.CIRCLE)

    println(circle.createManipulator().drag())
}