package locators;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.jsoup.Connection;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageLocator {

    public static SelenideElement loginField () {
        return BaseLocator.getInputFieldWithName("Логин:");
    }

    public static SelenideElement passwordField () {
        return BaseLocator.getInputFieldWithName("Пароль:");
    }

    public static SelenideElement enterButton( ) {
        return BaseLocator.getButtonWithText("Войти");
    }
}
