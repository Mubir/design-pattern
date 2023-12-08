package factorypattern

abstract class SSCstudent {

    fun bangla(): String {
        return "ও আমার দেশের মাটি,তোমার 'পরে ঠেকাই মাথা।"
    }

    fun english(): String {
        return " THere is no rule in love and war"
    }

    fun math(): String {
        return "a^2+b^2=c^2"
    }

    abstract fun compulsory(): String
    abstract fun auxiliary(): String


}