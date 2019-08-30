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
        //todo не правильно названы переменные. Номер нужно указывать с типом дока, так как у нас очень много доков разных
        String number = locators.SummaryFormLocator.numberField().getValue();
        //todo не плот. Лучше пиши fabula
        String plot   = locators.SummaryFormLocator.plotTextareaField().getValue();

        Assert.assertEquals( number, kusp.number() );
        Assert.assertEquals( plot,   kusp.plot()   );
    }
}
