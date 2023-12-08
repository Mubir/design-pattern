package abstractfactorypattern

class MacintoshOperatingSystem : OSFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckBox(): CheckBox {
        return MacCheck()
    }
}