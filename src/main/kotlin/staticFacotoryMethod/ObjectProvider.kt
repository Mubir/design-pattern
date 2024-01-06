package staticFacotoryMethod

class ObjectProvider private constructor(){

    object objectLikeSingleTone: Printer() {
        override fun getName(): String {
            return " I am single tone"
        }

        @JvmStatic
        fun create() = ObjectProvider()

    }

    companion object comObjIsLikeStatic:Printer(){
        // only companion object override methods can be @JvmStatic
        @JvmStatic
        override fun getName(): String {
            return " i am like static"
        }

        fun create() = ObjectProvider()

    }
}