package builderpattern

class JavaLikeBuilder(
    val requiredProperty: String,
    val secondaryPropOne: Int? = null,
    val secondaryPropTwo: Long? = null
) {

    class Builder(
        private var requiredProperty: String,
        private var secondaryPropOne: Int? = null,
        private var secondaryPropTwo: Long? = null
    ) {
        fun withSecondaryPropOne(x: Int) = apply {
            this.secondaryPropOne = x
        }

        fun withSecondaryPropTwo(x: Long) = apply {
            this.secondaryPropTwo = x
        }

        fun build() = JavaLikeBuilder(
            requiredProperty,
            secondaryPropOne,
            secondaryPropTwo
        )
    }
}