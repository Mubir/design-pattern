package builderpattern

class KDslBuilder(
    val requiredProperty: String,
    val secondaryPropOne: Int? = null,
    val secondaryPropTwo: Long? = null
) {
    companion object {
        inline fun dslEntry(req: String, block: Builder.() -> Unit): KDslBuilder {
            return Builder(req).apply(block).build()

        }
    }

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

        fun build() = KDslBuilder(
            requiredProperty,
            secondaryPropOne,
            secondaryPropTwo
        )
    }
}