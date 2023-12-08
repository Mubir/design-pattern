package abstractfactorypattern

class WindowsOperatingSystem:OSFactory {
    override fun createButton(): Button {
        return WinButton()
    }

    override fun createCheckBox(): CheckBox {
        return WinCheck()
    }
}