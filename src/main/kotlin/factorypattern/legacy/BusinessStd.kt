package factorypattern.legacy

class BusinessStd: SSCstudent() {
    override fun compulsory(): String {
        return "commerce std"
    }

    override fun auxiliary(): String {
        return "they rule wallstreet"
    }
}