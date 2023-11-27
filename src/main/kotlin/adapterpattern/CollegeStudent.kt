package adapterpattern

class CollegeStudent : Student {

    private val name:String = "Ali"
    private val email:String = "ali@gmail.com"
    private val address:String = "ali-toyo"

    override fun getName():String {
        return this.name
    }

    override fun getEmail():String {
        return this.email
    }

    override fun getAddress():String {
        return this.address
    }
}