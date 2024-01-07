package factorypattern

class CircleManipulator<T>(private val shpae:T):FigureManipulator<Circle> {
    override fun drag() = " this is circle "

    override fun resize(size: Float) = "resizing circle to radius $size"

}