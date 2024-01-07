package factorypattern

interface Figure {
    fun createManipulator():FigureManipulator<out Figure>
}