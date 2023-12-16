package commandpattern

class onComman(val electronicDevice: ElectronicDevice) : Command {
    override fun execute() :String{
       return electronicDevice.turnOn()
    }

    override fun unDo() :String{
       return electronicDevice.turnOff()
    }
}