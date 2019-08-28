package actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class VisibilityChecker {

    public static void checkLoginPageVisibility( )
    {
        locators.LoginPageLocator.loginField().shouldBe( Condition.visible );
        locators.LoginPageLocator.passwordField().shouldBe( Condition.visible );
    }

    public static void checkLoginPageInvisibility( )
    {
        locators.LoginPageLocator.loginField().shouldNotBe( Condition.visible );
        locators.LoginPageLocator.passwordField().shouldNotBe( Condition.visible );
    }

    public static void checkKuspFormVisibility( )
    {
        locators.KuspFormLocator.numberField().shouldBe( Condition.visible );
        locators.KuspFormLocator.plotField().shouldBe( Condition.visible );
        locators.KuspFormLocator.complainantFNameField().shouldBe( Condition.visible );
        locators.KuspFormLocator.complainantSNameField().shouldBe( Condition.visible );
        locators.KuspFormLocator.complainantPatronymicField().shouldBe( Condition.visible );
        locators.KuspFormLocator.formOfApplicationField().shouldBe( Condition.visible );
    }

    public static void checkKuspFormInvisibility( )
    {
        locators.KuspFormLocator.numberField().shouldNotBe( Condition.visible );
        locators.KuspFormLocator.plotField().shouldNotBe( Condition.visible );
        locators.KuspFormLocator.complainantFNameField().shouldNotBe( Condition.visible );
        locators.KuspFormLocator.complainantSNameField().shouldNotBe( Condition.visible );
        locators.KuspFormLocator.complainantPatronymicField().shouldNotBe( Condition.visible );
        locators.KuspFormLocator.formOfApplicationField().shouldNotBe( Condition.visible );
    }

    public static void checkMainToolboxVisibility( )
    {
        locators.MainToolboxLocator.mainToolbox().shouldBe( Condition.visible );
    }

    public static void checkMainToolboxInvisibility( )
    {
        locators.MainToolboxLocator.mainToolbox().shouldNotBe( Condition.visible );
    }

    public static void checkSummaryFormVisibility( )
    {
        locators.SummaryFormLocator.numberField().shouldBe( Condition.visible );
        locators.SummaryFormLocator.accidentAddressField().shouldBe( Condition.visible );
        locators.SummaryFormLocator.accidentDateField().shouldBe( Condition.visible );
        locators.SummaryFormLocator.accidentTimeField().shouldBe( Condition.visible );
        locators.SummaryFormLocator.accidentTypeField().shouldBe( Condition.visible );
        locators.SummaryFormLocator.crimeTypeInputField().shouldBe( Condition.visible );
    }

    public static void checkSummaryFormInvisibility( )
    {
        locators.SummaryFormLocator.numberField().shouldNotBe( Condition.visible );
        locators.SummaryFormLocator.accidentAddressField().shouldNotBe( Condition.visible );
        locators.SummaryFormLocator.accidentDateField().shouldNotBe( Condition.visible );
        locators.SummaryFormLocator.accidentTimeField().shouldNotBe( Condition.visible );
        locators.SummaryFormLocator.accidentTypeField().shouldNotBe( Condition.visible );
        locators.SummaryFormLocator.crimeTypeInputField().shouldNotBe( Condition.visible );
    }

    public static void checkVisibilityOf(SelenideElement element)
    {
        element.shouldBe( Condition.visible );
    }

}
