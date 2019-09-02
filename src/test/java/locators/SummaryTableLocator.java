package locators;

import com.codeborne.selenide.SelenideElement;

public class SummaryTableLocator extends TableLocator
{
    public static SelenideElement createButton()
    {
        return BaseLocator.getButtonWithText("Создать");
    }
}
