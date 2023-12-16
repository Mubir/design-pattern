package commandpattern

interface Command {
    fun execute(): String
    fun unDo(): String
}