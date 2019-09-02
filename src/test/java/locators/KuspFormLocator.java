package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class KuspFormLocator {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Поля

    public static SelenideElement complainantSNameField( )
    {
        return BaseLocator.getInputFieldWithName("Фамилия:");
    }

    public static SelenideElement complainantFNameField( )
    {
        return BaseLocator.getInputFieldWithName( "Имя:" );
    }

    public static SelenideElement complainantPatronymicField( )
    {
        return BaseLocator.getInputFieldWithName( "Отчество:" );
    }

    public static SelenideElement formOfApplicationField( )
    {
        return $x(".//input[ @placeholder='Форма поступления' ]");
    }

    public static SelenideElement fabulaField( )
    {
        return $x( ".//textarea");
    }

    public static SelenideElement boundList( )
    {
        return $x( ".//div[ contains( @id, 'boundlist' )]");
    }

    public static SelenideElement numberField( )
    {
        return BaseLocator.getInputFieldWithName( "№:");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Кнопки

    public static SelenideElement summaryButton( )
    {
        return BaseLocator.getButtonWithText( "Отправить в Сводку");
    }

    public static SelenideElement saveButton( )
    {
        return BaseLocator.getButtonWithText( "Сохранить" );
    }

    public static SelenideElement closeButton( )
    {
        return BaseLocator.getButtonWithText( "Закрыть" );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Сообщения

    public static SelenideElement kuspSavedMessage( String numberOfKusp )
    {
        String xpath = ".//div[text()='КУСП № "+numberOfKusp+" успешно сохранен']";
        return $x( xpath );
    }

    public static SelenideElement kuspSentToSummary( String numberOfKusp )
    {
        String xpath = ".//div[text()='КУСП № "+numberOfKusp+" отправлен в сводку']";
        return $x( xpath );
    }

}
