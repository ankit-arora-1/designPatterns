package factory;

import factory.buttons.Button;
import factory.buttons.IosButton;
import factory.dropdowns.Dropdown;
import factory.dropdowns.IosDropdown;
import factory.menus.IosMenu;
import factory.menus.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
