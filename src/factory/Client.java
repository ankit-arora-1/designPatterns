package factory;

import factory.buttons.Button;
import factory.menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
    }
}
