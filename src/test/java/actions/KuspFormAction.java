package actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import objects.Kusp;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class KuspFormAction {

    /////////////////////////////////////////////////////////////////////////////////////
    // Заполнение полей

    public static void setFName( String fName )
    {
        locators.KuspFormLocator.complainantFNameField().setValue( fName );
    }

    public static void setSName( String sName )
    {
        locators.KuspFormLocator.complainantSNameField( ).setValue( sName );
    }

    public static void setPlot( String plot )
    {
        locators.KuspFormLocator.plotField().setValue( plot );
    }

    public static String setFormOfApplication( String form )
    {
        SelenideElement crimeForm = locators.KuspFormLocator.formOfApplicationField();

        crimeForm.setValue( form );
        locators.KuspFormLocator.boundList().shouldBe( Condition.visible );
        crimeForm.pressEnter();

        sleep(100);

        return crimeForm.getValue();
    }

    /////////////////////////////////////////////////////////////////////////////////////
    // Нажатие на кнопки

    public static void clickOnSaveButton( )
    {
        locators.KuspFormLocator.saveButton().click();
        String numberOfKusp = locators.KuspFormLocator.numberField().getValue();
        locators.KuspFormLocator.kuspSavedMessage( numberOfKusp ).shouldBe( Condition.visible );
    }

    public static void clickOnCloseButton()
    {
        locators.KuspFormLocator.closeButton().click();

    }

    static public void clickOnSummaryButton( ){
        locators.KuspFormLocator.summaryButton().click();

        String numberOfKusp = locators.KuspFormLocator.numberField().getValue();
        locators.KuspFormLocator.kuspSentToSummary( numberOfKusp ).shouldBe( Condition.visible );
    }

    /////////////////////////////////////////////////////////////////////////////////////

    public static void checkField( SelenideElement element, String value ){
        String text = element.getValue();
        Assert.assertEquals( value, text );
    }

    public static void assertKusp( Kusp kusp ){

        SelenideElement numberField = locators.KuspFormLocator.numberField();
        SelenideElement lNameField = locators.KuspFormLocator.complainantSNameField();
        SelenideElement plotField = locators.KuspFormLocator.plotField();
        SelenideElement applicationField = locators.KuspFormLocator.formOfApplicationField();

        checkField( numberField, kusp.number() );
        checkField( lNameField, kusp.lastName());
        checkField( plotField, kusp.plot() );
        checkField( applicationField, kusp.applicationForm() );
    }


}
