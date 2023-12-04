package bridgepattern

class GeorgeCooper(override val detention: Detention) : Cooper() {
    override fun currentLocation() :String {
       return detention.showStatus()
    }
}