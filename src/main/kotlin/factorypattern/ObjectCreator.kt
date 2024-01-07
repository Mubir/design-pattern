package factorypattern

class ObjectCreator:FigureFactory {
    override fun createObj(type: FigureFactory.Type): Figure {
      return  when(type){
            FigureFactory.Type.CIRCLE -> Circle()
            FigureFactory.Type.SQUARE -> Squre()
            else -> throw Exception("unkonown")
        }
    }
}