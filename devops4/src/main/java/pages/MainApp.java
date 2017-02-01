package pages;

import components.BaseWebUI;
import components.LeftMenu;

public class MainApp extends BaseWebUI {

    public MainApp() {
    }

    public LeftMenu goToLeftMenu() {
        return new LeftMenu();
    }
}
