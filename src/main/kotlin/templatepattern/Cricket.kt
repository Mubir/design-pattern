package templatepattern

class Cricket: Game() {
    override fun hasReferee() = false
    override fun hasBat() = false
    override fun leReferee() {
        TODO("Not yet implemented")
    }

    override fun leBall() {
        println(" Ball :: kookaburra ball")
    }

    override fun leUmpire() {
        println("Upmire::Symond Toffel")
    }

    override fun leBat() {
        println("Bat::MRF")
    }
}