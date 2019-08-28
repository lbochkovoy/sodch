package locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.InvalidElementStateException;

import java.util.List;
import java.util.ListIterator;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainToolboxLocator {

    private static String mainToolboxXpath = ".//div[@id='window-maintoolbox']";

    /* Принимает наименование элемента и наименование блока.
     * Возвращает xpath до элемента меню
     */
    public static SelenideElement menuElement( String nameOfElement, String nameOfBlock )
    {
        String xpath = mainToolboxXpath+"//div[.='"+nameOfBlock+"']/following-sibling::div//label[text()='"+nameOfElement+"']";
        return $x( xpath );
    }

    /* Возвращает блок главного меню
     */
    public static SelenideElement mainToolbox()
    {
        return $x( mainToolboxXpath );
    }



}
