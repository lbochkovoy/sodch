package actions;

import com.codeborne.selenide.Condition;
import locators.LoginPageLocator;

import static locators.LoginPageLocator.loginField;
import static locators.LoginPageLocator.passwordField;

public class LoginPageAction {

    public static void setLogin( String login ){
        loginField().setValue( login );
    }

    public static void setPassword( String password ){
        passwordField().setValue( password );
    }

    public static void enterToSodch( ){
        LoginPageLocator.enterButton().click();
        VisibilityChecker.checkMainToolboxVisibility();
    }

    public static void enterToSodchWithLoginAndPassword( String login, String password )
    {
        LoginPageAction.setLogin( login );
        LoginPageAction.setPassword( password );
        LoginPageAction.enterToSodch();
    }

    public static void checkVisible ( )
    {
        loginField().shouldBe( Condition.visible);
        passwordField().shouldBe( Condition.visible );
    }
}
