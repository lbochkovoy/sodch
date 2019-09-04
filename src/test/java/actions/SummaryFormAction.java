package actions;

import com.codeborne.selenide.SelenideElement;
import locators.SummaryFormLocator;
import objects.Kusp;
import org.jsoup.Connection;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.sleep;

public class SummaryFormAction {

    public static void setFabula( String text )
    {
        locators.SummaryFormLocator.fabulaTextareaField().setValue( text );
    }

    public static void setKuspNumber( String number )
    {
        locators.SummaryFormLocator.numberField().setValue( number );
    }

    public static void setAccidentType( String accidentType )
    {
        locators.SummaryFormLocator.accidentTypeField().setValue( accidentType );
    }

    public static void setTypeOfCrime( String type )
    {
        SelenideElement element = locators.SummaryFormLocator.crimeTypeInputField();
        BaseAction.setValueOnList( element, type );
    }

    public static void assertKusp( Kusp kusp )
    {
        //todo не правильно названы переменные. Номер нужно указывать с типом дока, так как у нас очень много доков разных
        String number = locators.SummaryFormLocator.numberField().getValue();
        //todo не плот. Лучше пиши fabula
        String fabula   = locators.SummaryFormLocator.fabulaTextareaField().getValue();

        Assert.assertEquals( number, kusp.number() );
        Assert.assertEquals( fabula,   kusp.fabula()   );
    }

    public static void clickOnToolMenu( String name )
    {
        SummaryFormLocator.menuOnToolbar( name ).click();

    }

    public static void clickOnSaveButton( )
    {
        SummaryFormLocator.saveButton().click();
    }

    public static void assertFields( String fabula,
                                     String crimeType,
                                     String accidentType )
    {
        String fabulaValue = SummaryFormLocator.fabulaTextareaField().getValue();
        String crimeTypeValue = SummaryFormLocator.crimeTypeInputField().getValue();
        String accidentTypeValue = SummaryFormLocator.accidentTypeField().getValue();

        Assert.assertEquals( fabula, fabulaValue );
        Assert.assertEquals( crimeType, crimeTypeValue);
        Assert.assertEquals( accidentType, accidentTypeValue );
    }
    public static class ObjectsToolMenu{

        public static void setConfiscted( String text ) {
            SummaryFormLocator.Objects.confiscatedObjectsField().setValue(text);
        }

        public static void assertFields( String text ) {
            String value = SummaryFormLocator.Objects.confiscatedObjectsField().getValue();
            Assert.assertEquals( text, value );
        }
    }

    public static class DecisionToolMenu{

        public static void clickOnInitiateUdCheckbox( )
        {
            SummaryFormLocator.Decision.initiatedUdCheckbox().click();
        }

        public static void setLastName( String name )
        {
            SummaryFormLocator.Decision.lastNameOfDecisionMaker().setValue( name );
        }

        public static void setPositionOfDecisionMaker( String position )
        {
            SummaryFormLocator.Decision.positionOfDecisionMaker().setValue( position );
        }

        public static void setDateOfDecision( String dateInStringFormat )
        {
            SummaryFormLocator.Decision.dateOfDecisionField().setValue( dateInStringFormat );
        }

        public static void setUdNumber( String number )
        {
            SummaryFormLocator.Decision.numberOfUdField().setValue( number );
        }

        public static void setDisclosureType( boolean isDisclosured )
        {
            if( !isDisclosured )
            {
                SelenideElement element = SummaryFormLocator.Decision.disclosureField();
                BaseAction.setValueOnList( element, "Не раскрыто" );
            }
            else
            {
                SelenideElement element = SummaryFormLocator.Decision.disclosureField();
                BaseAction.setValueOnList( element, "Раскрыто" );
            }
        }

        public static void assertFields( String lastNameValue,
                                         String positionOfDecisionMakerValue,
                                         String numberOfUdFieldValue,
                                         boolean disclosureTypeValue ) {
            String lastName = SummaryFormLocator.Decision.lastNameOfDecisionMaker().getValue();
            String positionOfDecisionMaker = SummaryFormLocator.Decision.lastNameOfDecisionMaker().getValue( );
            String numberOfUdField = SummaryFormLocator.Decision.numberOfUdField().getValue( );
            String disclosureType = SummaryFormLocator.Decision.disclosureField().getValue( );

            Assert.assertEquals( lastName, lastNameValue );
            Assert.assertEquals( positionOfDecisionMakerValue, positionOfDecisionMaker );
            Assert.assertEquals( numberOfUdField, numberOfUdFieldValue );
            Assert.assertEquals( (disclosureType == "Решено"), disclosureTypeValue );
        }
    }

    public static class OperGroupToolMenu{

        public static void setSogComposition( String text )
        {
            SummaryFormLocator.OperGroup.sogCompositionField().setValue( text );
        }

        public static void assertFields( String text )
        {
            String value = SummaryFormLocator.OperGroup.sogCompositionField().getValue();
            Assert.assertEquals( text, value );
        }
    }

    public static class People{

        public static void clickOnAppendButton( )
        {
            SummaryFormLocator.People.appendButton().click();
        }

        public static void setLastName( String lastName )
        {
            SummaryFormLocator.People.lastName().setValue( lastName );
        }

        public static void setParticipationType( String type )
        {
            SelenideElement element = SummaryFormLocator.People.typeOfParticipation();
            BaseAction.setValueOnList( element, type );
        }

        public static void clickSaveButton( )
        {
            SummaryFormLocator.People.saveButton().click();
        }

        public static void assertFields( String lastName,
                                         String type    )
        {
            String lastNameValue = SummaryFormLocator.People.lastName().getValue();
            String typeValue = SummaryFormLocator.People.typeOfParticipation().getValue();

            Assert.assertEquals( lastName, lastNameValue );
            Assert.assertEquals( typeValue, type );
        }
    }
}
