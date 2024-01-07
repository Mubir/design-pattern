package factorypattern

class SqureManipulator<T>(private val figure:T):FigureManipulator<Squre> {
    override fun drag() = " this is Squre "

    override fun resize(size: Float) = "resizing squre to body $size"
}