package factory;

import factory.buttons.AndroidButton;
import factory.buttons.Button;
import factory.dropdowns.AndroidDropdown;
import factory.dropdowns.Dropdown;
import factory.menus.AndroidMenu;
import factory.menus.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
