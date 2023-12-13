package iteratorpattern

fun main(arg: Array<String>) {

    val collection = MyLameCollection()
    collection.addItem(MyPair(1, "#$$$"))
    collection.addItem(MyPair(2, "¥»»»"))
    collection.addItem(MyPair(3, "****"))

    val itr = collection.createIterator(collection)

    while (itr.hasNext()) {
        println(itr.getNext())
    }
}