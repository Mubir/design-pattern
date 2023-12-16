package commandpattern

class offComman(val electronicDevice: ElectronicDevice) : Command {
    override fun execute() :String{
       return electronicDevice.turnOff()
    }

    override fun unDo() :String{
       return electronicDevice.turnOn()
    }
}