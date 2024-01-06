package staticFacotoryMethod

abstract class Printer {
    abstract fun getName():String

    fun print(){
        val name = this.getName()
        print(name)
    }
}