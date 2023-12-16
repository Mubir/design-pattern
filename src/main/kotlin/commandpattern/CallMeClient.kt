package commandpattern

fun main(str: Array<String>) {
    val tv: ElectronicDevice = Television()
    val commandOn: Command = onComman(tv)
    val buttonOn = DeviceButton(commandOn)
    buttonOn.pressed()
    buttonOn.undoPressed()

    val commandOff: Command = offComman(tv)
    val buttonOff = DeviceButton(commandOff)
    buttonOff.pressed()
    buttonOff.undoPressed()

}