package actions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import objects.Kusp;

import static com.codeborne.selenide.Condition.text;

public class TableAction {

    public static void enterToKusp( Kusp kusp)
    {
        locators.TableLocator.findInColumn( "КУСП", kusp.number() ).doubleClick();
    }
}
