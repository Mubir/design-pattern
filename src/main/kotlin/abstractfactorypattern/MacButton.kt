package abstractfactorypattern

class MacButton : Button {
    override fun pressMe(): String {
        return "Button::Sonoma"
    }
}