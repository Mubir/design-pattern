package delegationpattern

class WithoutKtDelegate(
    private val tcr: Teacher,
    private val std: Student
) : Teacher, Student {
    override fun showStdName(): String {
        return tcr.showTrName()
    }

    override fun showTrName(): String = std.showStdName()
}