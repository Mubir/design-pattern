package delegationpattern

class KtDelegation(
    private val tcr: Teacher,
    private val std: Student
) : Teacher by tcr, Student by std
{
    // boiler plate code
    // so no need to do
    // kt will handle it.
}