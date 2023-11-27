package adapterpattern

class TurnSchoolStdToCollegeStdAdapter(schoolStudent: SchoolStudent) : Student {

    private val schoolStudent = schoolStudent

    override fun getName(): String {
        return schoolStudent.getName()
    }

    override fun getEmail(): String {
        return schoolStudent.phone.toString() + "@gmail.com"
    }

    override fun getAddress(): String {
        return schoolStudent.getAddress()
    }
}