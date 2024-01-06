package builderpattern

import builderpattern.KDslBuilder.Companion.dslEntry

fun main(array: Array<String>) {

    val obj = JavaLikeBuilder.Builder("I am builder")
        .withSecondaryPropOne(19)
        .withSecondaryPropTwo(11L)
        .build()

    println(obj.requiredProperty)

    val objTwo = dslEntry("dsl builder"){
        withSecondaryPropOne(666)
        withSecondaryPropTwo(786L)
    }

    println(objTwo.requiredProperty)
}