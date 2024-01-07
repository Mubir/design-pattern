package factorypattern

interface FigureFactory {
    enum class Type {
        CIRCLE,
        SQUARE,
        LINE,
        UNDEFINED
    }

    fun createObj(type: Type): Figure
}