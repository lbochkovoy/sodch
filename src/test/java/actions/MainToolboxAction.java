package actions;

import locators.MainToolboxLocator;

public class MainToolboxAction {

    public static void clickOnMenu( String nameOfElement, String nameOfBlock ){
        MainToolboxLocator.menuElement( nameOfElement, nameOfBlock ).click();
    }
}
