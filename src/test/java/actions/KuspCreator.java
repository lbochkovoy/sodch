package actions;

import locators.KuspFormLocator;
import objects.Kusp;
import org.junit.Assert;

import java.beans.Visibility;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class KuspCreator {

    public static ArrayList< Kusp > takeFromProperties( )
    {
        ArrayList< Kusp > kusps = new ArrayList< Kusp >();

        Properties propertiesMaster = new Properties();
        try (InputStream kuspStream = new FileInputStream("kusp.properties"))
        {
            propertiesMaster.load( kuspStream );

            Kusp kusp1 = new Kusp();
            kusp1.setLastName( propertiesMaster.getProperty("lastName1"));
            kusp1.setFirstName( propertiesMaster.getProperty("firstName1"));
            kusp1.setPatronymic( propertiesMaster.getProperty("patronymic1"));
            kusp1.setPhone( propertiesMaster.getProperty("phone1"));
            kusp1.setPlot( propertiesMaster.getProperty("plot1"));

            Kusp kusp2 = new Kusp();
            kusp1.setLastName( propertiesMaster.getProperty("lastName2"));
            kusp1.setFirstName( propertiesMaster.getProperty("firstName2"));
            kusp1.setPatronymic( propertiesMaster.getProperty("patronymic2"));
            kusp1.setPhone( propertiesMaster.getProperty("phone2"));
            kusp1.setPlot( propertiesMaster.getProperty("plot2"));

            Kusp kusp3 = new Kusp();
            kusp1.setLastName( propertiesMaster.getProperty("lastName3"));
            kusp1.setFirstName( propertiesMaster.getProperty("firstName3"));
            kusp1.setPatronymic( propertiesMaster.getProperty("patronymic3"));
            kusp1.setPhone( propertiesMaster.getProperty("phone3"));
            kusp1.setPlot( propertiesMaster.getProperty("plot3"));

            kusps.add( kusp1 );
            kusps.add( kusp2 );
            kusps.add( kusp3 );

        }
        catch( IOException exception ){
            exception.printStackTrace();
        }

        return kusps;

    }

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
