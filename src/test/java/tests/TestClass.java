package tests;

import actions.MainToolboxAction;
import com.codeborne.selenide.Configuration;
import objects.Kusp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

@RunWith(Parameterized.class)
public class TestClass {

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] dataArrays = {
                { "operalex", "operalex", Kusp.generateKusp() }
        };

        Collection< Object[] > result = Arrays.asList( dataArrays );
        return result;
    }

    @Before
    public void setConfigurations()
    {
        Configuration.timeout = 30000;
        open("http://192.168.238.237:10004/mvd/#backdoor" );
    }

    private String login;
    private String password;
    private Kusp   kusp;

    public TestClass( String login, String password, Kusp kusp )
    {
        this.login = login;
        this.password = password;
        this.kusp = kusp;
    }

    @Test
    public void mainTest( )
    {
        actions.LoginPageAction.checkVisible();
        actions.LoginPageAction.enterToSodchWithLoginAndPassword( login, password );

        actions.KuspCreator.createKusp( kusp );
        actions.MainToolboxAction.clickOnMenu("В работе", "КУСП");
        actions.TableAction.enterToKusp( kusp );
        actions.KuspFormAction.assertKusp( kusp );
        actions.MainToolboxAction.clickOnMenu( "Журнал", "Сводка");
        actions.TableAction.enterToKusp( kusp );
        actions.SummaryFormAction.assertKusp( kusp );

    }

    @After
    public void exit()
    {
        close();
    }
}