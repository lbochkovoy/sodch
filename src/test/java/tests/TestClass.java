package tests;

import actions.MainToolboxAction;
import com.codeborne.selenide.Configuration;
import objects.Kusp;
import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

@RunWith(Parameterized.class)
public class TestClass {


    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        ArrayList< Kusp > kusps = ParamsSetter.getKusps();
        String[] testData = ParamsSetter.getTestParams("test2");

        String login = testData[0];
        String password = testData[1];
        String url = testData[2];

        ArrayList< Object[] > dataList = new ArrayList<Object[]>();

        ListIterator< Kusp > kuspsIter = kusps.listIterator();
        while ( kuspsIter.hasNext() )
        {
            Kusp currentKusp = kuspsIter.next();
            Object[] objects = { login, password, currentKusp, url};
            dataList.add( objects );
        }

        Collection< Object[] > result = dataList;
        return result;
    }

    private String login;
    private String password;
    private Kusp   kusp;
    private String url;

    @Before
    public void setConfigurations()
    {
        Configuration.timeout = 30000;
        open( url );
    }

    public TestClass( String login, String password, Kusp kusp, String url )
    {
        this.login = login;
        this.password = password;
        this.kusp = kusp;
        this.url = url;
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