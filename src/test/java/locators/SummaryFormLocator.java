package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SummaryFormLocator {

    public static SelenideElement fabulaTextareaField( )
    {
        String xpath = ".//div[.='Фабула:']//textarea";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement summarySectionInputField( )
    {
        String xpath = ".//div[.='Раздел сводки:']//input";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement crimeTypeInputField( )
    {
        String xpath = ".//div[.='Вид преступления:']//input";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement territorialOfficeInputField( )
    {
        String xpath = ".//div[.='Вид преступления:']//input";
        SelenideElement field = $x( xpath );

        return field;
    }

     public static SelenideElement numberField( )
     {
         String xpath = ".//div[.='КУСП №:']//input";
         SelenideElement field = $x( xpath );

         return field;
     }

    public static SelenideElement registrationDateField( )
    {
        String xpath = ".//div[.='Дата и время регистрации:']//input[1]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement registrationTimeField( )
    {
        String xpath = ".//div[.='Дата и время регистрации:']//input[2]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentDateField( )
    {
        String xpath = ".//div[.='Дата и время происшествия:']//input[1]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentTimeField( )
    {
        String xpath = ".//div[.='Дата и время происшествия:']//input[2]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentTypeField( )
    {
        String xpath = ".//div[.='Тип происшествия:']//input[1]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentAddressField( )
    {
        String xpath = ".//div[.='Адрес происшествия:']//input";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement menuOnToolbar( String menuName )
    {
        return $x(".//div[contains( @id, 'tabbar' )]//span[text()='"+menuName+"']");
    }
}
