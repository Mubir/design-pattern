package templatepattern

class Football : Game() {
    override fun hasUmpire() = false
    override fun hasBat() = false
    override fun leReferee() {
        println("Refree::Pierluigi Collina")
    }

    override fun leBall() {
        println("Ball::Jabulani")
    }

    override fun leUmpire() {
        TODO("Not yet implemented")
    }

    override fun leBat() {
        TODO("Not yet implemented")
    }
}