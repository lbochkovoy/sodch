package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BaseLocator {

    /* Возвращает кнопку с данным текстом */
    public static SelenideElement getButtonWithText( String buttonText )
    {
        String xpath = ".//span[text()='"+buttonText+"']";
        return $x( xpath );
    }

    /* Возвращает элемент с полем ввода для данного имени */
    public static SelenideElement getInputFieldWithName( String fieldName )
    {
        String xpath = ".//div[.='"+fieldName+"']//input";
        return $x( xpath );
    }
}
