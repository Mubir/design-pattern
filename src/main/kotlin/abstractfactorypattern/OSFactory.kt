package abstractfactorypattern

interface OSFactory {
    fun createButton(): Button
    fun createCheckBox(): CheckBox
}