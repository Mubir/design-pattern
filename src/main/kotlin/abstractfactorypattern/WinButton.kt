package abstractfactorypattern

class WinButton : Button {
    override fun pressMe(): String {
        return "Button::WIN98"
    }

}