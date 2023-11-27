package adapterpattern

fun main(args: Array<String>){
    println(" calling adapter ..... ")

    val cS = CollegeStudent()
    val sS = SchoolStudent()
    var listOfStd= mutableListOf<Student>()

    listOfStd.add(cS)
    //এখানে আমরা  ফোন নম্বর কে ইমেইল এ চেঞ্জ করেছি । মানে এডাপটাবলে করেছি
    listOfStd.add(TurnSchoolStdToCollegeStdAdapter(sS))

    listOfStd.forEach {
        println("name: ${it.getName()}\nemail: ${it.getEmail()} \naddress: ${it.getAddress()}")
    }

}

