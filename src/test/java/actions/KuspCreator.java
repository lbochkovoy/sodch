package actions;

import locators.KuspFormLocator;
import objects.Kusp;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class KuspCreator {

    public static Kusp createKusp( Kusp kusp )
    {
        Assert.assertNotEquals( kusp.lastName(),        null );
        Assert.assertNotEquals( kusp.plot(),            null );
        Assert.assertNotEquals( kusp.applicationForm(), null );

        actions.MainToolboxAction.clickOnMenu( "Создать КУСП", "КУСП");

        VisibilityChecker.checkKuspFormVisibility();

        String newApplicationForm = KuspFormAction.setFormOfApplication( kusp.applicationForm() );
        kusp.setApplicationForm( newApplicationForm );
        KuspFormAction.setSName( kusp.lastName() );
        KuspFormAction.setPlot( kusp.plot() );
        String newNumber = KuspFormLocator.numberField().getValue();
        KuspFormAction.clickOnSaveButton();
        kusp.setNumber( newNumber );
        KuspFormAction.clickOnSummaryButton();
        KuspFormAction.clickOnCloseButton();

        VisibilityChecker.checkKuspFormInvisibility();

        return kusp;
    }
}
