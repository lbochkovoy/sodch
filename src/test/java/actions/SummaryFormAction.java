package actions;

import objects.Kusp;
import org.junit.Assert;

public class SummaryFormAction {

    public static void setPlot( String text )
    {
        locators.SummaryFormLocator.plotTextareaField().setValue( text );
    }

    public static void setKuspNumber( String number )
    {
        locators.SummaryFormLocator.numberField().setValue( number );
    }

    public static void setAccidentType( String accidentType )
    {
        locators.SummaryFormLocator.accidentAddressField().setValue( accidentType );
    }

    public static void assertKusp( Kusp kusp )
    {
        String number = locators.SummaryFormLocator.numberField().getValue();
        String plot   = locators.SummaryFormLocator.plotTextareaField().getValue();

        Assert.assertEquals( number, kusp.number() );
        Assert.assertEquals( plot,   kusp.plot()   );
    }
}
