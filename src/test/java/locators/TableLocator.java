package locators;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;
import java.util.Iterator;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TableLocator {

    // Возвращает список с наименованиями видимых колонок

    public static ElementsCollection visibleColumns() {
        String xpath = ".//div[@class='x-column-header-text-wrapper']//span";
        ElementsCollection resultElements = $$x( xpath );
        return resultElements.filter(Condition.visible);
    }

    public static int indexOfColumnWithName( String nameOfColumn ) {
        ElementsCollection columnsOfTable = visibleColumns();
        SelenideElement columnWithName = columnsOfTable.find( text(nameOfColumn) );
        int indexOfColumn = columnsOfTable.indexOf( columnWithName );
        return indexOfColumn;
    }

    //
    public static ElementsCollection fieldsOfColumn( String nameOfColumn ){
        int indexOfColumn = indexOfColumnWithName( nameOfColumn );
        String xpath = ".//table//td["+(indexOfColumn+1)+"]";
        return $$x( xpath );
    }

    public static SelenideElement findInColumn(String nameOfColumn, String value )
    {
        ElementsCollection fields = locators.TableLocator.fieldsOfColumn( nameOfColumn );
        SelenideElement field = fields.find( text(value) );
        return field;
    }

    public static SelenideElement element( int rowIndex, int columnIndex )
    {
        return $x("//table["+(rowIndex+1)+"]//td["+(columnIndex+1)+"]");
    }

}
