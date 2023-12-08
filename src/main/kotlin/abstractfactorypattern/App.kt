package abstractfactorypattern

class App(osFactory: OSFactory) {
    var button: Button = osFactory.createButton()
    var checkBox: CheckBox = osFactory.createCheckBox()

    fun print() {
        println(button.pressMe())
        println(checkBox.selectMe())
    }
}