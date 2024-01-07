package factorypattern



class Circle: Figure{
    override fun createManipulator(): FigureManipulator<out Figure> =
        CircleManipulator(this)
}