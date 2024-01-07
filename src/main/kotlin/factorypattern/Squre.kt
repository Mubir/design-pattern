package factorypattern

class Squre : Figure {
    override fun createManipulator(): FigureManipulator<out Figure> =
        SqureManipulator(this)
}