package factorypattern.legacy

class ScienceStd: SSCstudent() {
    override fun compulsory(): String {
        return "Math,Physics,Chemistry"
    }

    override fun auxiliary(): String {
       return "Zoology"
    }
}