package bridgepattern

class SheldonCooper(override val detention: Detention) : Cooper() {
    override fun currentLocation() :String {
       return detention.showStatus()
    }
}