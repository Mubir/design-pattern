package factorypattern

interface FigureManipulator<T:Figure> {

    fun drag() : String
    fun resize(size:Float) :String
}