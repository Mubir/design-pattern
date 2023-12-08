package bridgepattern

fun main(arg: Array<String>) {
    val elderCooper = GeorgeCooper(PrincipalsOffice())
    val youngerCooper = SheldonCooper(Church())

    println("George at: ${elderCooper.currentLocation()}")
    println("Sheldon at: ${youngerCooper.currentLocation()}")
}

