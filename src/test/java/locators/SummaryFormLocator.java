package locators;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
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
        String xpath = ").//div[.='Дата и время регистрации:']//input)[1]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement registrationTimeField( )
    {
        String xpath = "(.//div[.='Дата и время регистрации:']//input)[2]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentDateField( )
    {
        String xpath = "(.//div[.='Дата и время происшествия:']//input)[1]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentTimeField( )
    {
        String xpath = "(.//div[.='Дата и время происшествия:']//input)[2]";
        SelenideElement field = $x( xpath );

        return field;
    }

    public static SelenideElement accidentTypeField( )
    {
        String xpath = "(.//div[.='Тип происшествия:']//input)[1]";
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
        SelenideElement button = $x(".//div[contains( @id, 'tabbar' )]//span[text()='"+menuName+"']");
        button.scrollIntoView( true );
        return button;
    }

    public static SelenideElement confiscatedObjectsField( )
    {
        return $x( ".//div[.='Изъято:']//textarea");
    }

    public static SelenideElement decisionField( )
    {
        return BaseLocator.getInputFieldWithName("Фамилия:");
    }

    public static SelenideElement positionOfDecisionMaker( )
    {
        return BaseLocator.getInputFieldWithName("Должность:");
    }

    public static SelenideElement saveButton( )
    {
        return $$x(".//span[text()='Сохранить']").find( Condition.visible );
    }

    public static class Objects{
        public static SelenideElement confiscatedObjectsField( )
        {
            return $x( ".//div[.='Изъято:']//textarea");
        }
    }

    public static class Decision {

        public static SelenideElement initiatedUdCheckbox()
        {
            return $x("(.//div[.='Возбуждено уголовное дело']//span)[2]");
        }
        public static SelenideElement lastNameOfDecisionMaker() {
            return BaseLocator.getInputFieldWithName("Фамилия:");
        }

        public static SelenideElement positionOfDecisionMaker() {
            return BaseLocator.getInputFieldWithName("Должность:");
        }

        public static SelenideElement dateOfDecisionField()
        {
            return BaseLocator.getInputFieldWithName( "Дата принятия решения:" );
        }

        public static SelenideElement numberOfUdField( )
        {
            return BaseLocator.getInputFieldWithName("№ УД:");
        }

        public static SelenideElement disclosureField( )
        {
            return BaseLocator.getInputFieldWithName("Раскрытие:");
        }
    }

    public static class OperGroup
    {
        public static SelenideElement sogCompositionField( )
        {
            return $x(".//div[.='Состав СОГ:']//textarea");
        }
    }

    public static class People
    {
        public static SelenideElement firstName( )
        {
            return BaseLocator.getInputFieldWithName("Имя:");
        }

        public static SelenideElement lastName( )
        {
            return $x("(.//div[.='Фамилия:']//input)[2]");
        }

        public static SelenideElement patronymic( )
        {
            return BaseLocator.getInputFieldWithName( "Отчество:");
        }

        public static SelenideElement typeOfParticipation( )
        {
            return BaseLocator.getInputFieldWithName("Тип связи:");
        }

        public static SelenideElement appendButton( )
        {
            return BaseLocator.getButtonWithText("Добавить");
        }

        public static SelenideElement saveButton( )
        {
            SelenideElement button = $x("(.//span[.='Добавить'])[2]");
            button.scrollIntoView( true );
            return button;
        }
    }


}
