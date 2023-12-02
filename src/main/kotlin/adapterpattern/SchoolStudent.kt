package adapterpattern

class SchoolStudent {
    private val name: String = "Punu_mia"
    val phone: Int = 880808080
    private val address: String = "Hakata"

    fun getName(): String {
        return this.name
    }

    fun getEmail(): Int {
        return this.phone
    }

    fun getAddress(): String {
        return this.address
    }
}