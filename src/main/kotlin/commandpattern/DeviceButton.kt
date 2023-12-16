package commandpattern

class DeviceButton(val cmd: Command) {

    fun pressed() {
        println(cmd.execute())
    }

    fun undoPressed() {
        println(cmd.unDo())
    }
}