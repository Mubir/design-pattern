package iteratorpattern

class MyLameCollection {

    val list = ArrayList<MyPair>()

    fun addItem(pair: MyPair) {
        list.add(pair)
    }

    class gabtoliToFarmGate(private val myLameCollection: MyLameCollection) : Iterator {
        private var pointer = 0;
        override fun hasNext(): Boolean {
            return pointer < myLameCollection.list.size
        }

        override fun getNext(): MyPair {
            return myLameCollection.list[pointer++]
        }
    }

    fun createIterator(myLameCollection: MyLameCollection): Iterator {
        return gabtoliToFarmGate(myLameCollection)
    }
}