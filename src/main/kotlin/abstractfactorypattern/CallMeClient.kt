package abstractfactorypattern

fun main(args:Array<String>)
{
    val obj = App(WindowsOperatingSystem())
    obj.print()
}
