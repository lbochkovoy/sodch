package actions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import locators.TableLocator;
import objects.Kusp;

import static com.codeborne.selenide.Condition.text;

public class TableAction {

    public static void enterToKusp( Kusp kusp)
    {
        SelenideElement columnElement = locators.TableLocator.findInColumn( "КУСП", kusp.number() );
        columnElement.doubleClick();
    }

    public static void toRowWIthIndex( int rowIndex )
    {
        TableLocator.fieldsOfColumn("КУСП").get(0).doubleClick();
    }

    public static void sortByColumn( String fieldName, boolean orderByAscending )
    {
        locators.TableLocator.columnWithName("Дата передачи в сводку").click();

        if( !orderByAscending )
        {
            locators.TableLocator.columnWithName("Дата передачи в сводку").click();
        }
    }
}
