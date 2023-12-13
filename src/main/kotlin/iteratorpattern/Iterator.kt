package iteratorpattern

interface Iterator {
    fun hasNext(): Boolean
    fun getNext(): MyPair
}