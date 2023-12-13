package templatepattern

abstract class Game {

    fun gameIsOn() {
        if (hasReferee()) {
            leReferee()
        }
        if (hasBall()) {
            leBall()
        }
        if (hasUmpire()) {
            leUmpire()
        }
        if (hasBat()) {
            leBat()
        }
    }

    abstract fun leReferee()
    abstract fun leBall()
    abstract fun leUmpire()
    abstract fun leBat()

    open fun hasReferee() = true
    fun hasBall() = true
    open fun hasBat() = true
    open fun hasUmpire() = true

}