package tests;

import actions.MainToolboxAction;
import actions.SummaryFormAction;
import actions.VisibilityChecker;
import com.codeborne.selenide.Configuration;
import locators.TableLocator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class Test_SummaryWithAllTabs {
    //todo напиши тест с созданием сообщения сводки с заполнением обязательных полей на основной форме и заполнением всех вкладок обязательными полями.Сохрани, найди сообщение, открой и проверь что всё корректно отображается. Задание до вторника.
    //todo сделай файл гит игнор файл для того, чтобы при коммите и пуше у тебя не тянулись ненужные файлы (до среды)
    //todo правки по текущей реализации (до среды)

    private String url;

    @Before
    public void setConfigurations()
    {
        Configuration.timeout = 30000;
        open( "http://192.168.238.65:10002/mvd/#backdoor" );
    }

    @Test
    public void mainTest( )
    {
        actions.LoginPageAction.checkVisible();
        actions.LoginPageAction.enterToSodchWithLoginAndPassword( "operalex", "operalex" );

        actions.MainToolboxAction.clickOnMenu("Журнал", "Сводка");
        actions.SummaryTableAction.clickOnAppendButton();


        String fabula = "ФАБУЛА_1";
        String accidentType = "Аварии в городском хозяйстве";
        String typeOfCrime = "Бандитизм";
        String confiscatedObjects = "Предмет1";
        String lastNameOfDecisionMaker = "Иванов";
        String positionOfDecisionMaker = "Аналитик";
        String udNumber = "111";
        boolean isDisclosure = false;
        String sogComposition = "111 222 333";
        String lastNameOfDetained = "Петров";
        String participationType = "Посещает";

        objects.SummaryCreator.createSummary();
        MainToolboxAction.clickOnMenu( "Журнал", "Сводка");

        actions.MainToolboxAction.clickOnMenu("Журнал", "Сводка");
        actions.VisibilityChecker.checkVisibilityOf(TableLocator.columnWithName("Дата передачи в сводку"));
        actions.TableAction.sortByColumn("Дата передачи в сводку", false);
        actions.TableAction.toRowWIthIndex(0);

        actions.SummaryFormAction.assertFields( fabula, typeOfCrime, accidentType );
        actions.SummaryFormAction.clickOnToolMenu("Предметы");
        actions.SummaryFormAction.ObjectsToolMenu.assertFields( confiscatedObjects );
        actions.SummaryFormAction.clickOnToolMenu("Лица");
        actions.SummaryFormAction.People.assertFields( lastNameOfDetained, participationType );
        actions.SummaryFormAction.clickOnToolMenu("Выезжали");
        actions.SummaryFormAction.OperGroupToolMenu.assertFields( sogComposition );
        actions.SummaryFormAction.clickOnToolMenu("Решение");
        actions.SummaryFormAction.DecisionToolMenu.assertFields( lastNameOfDecisionMaker, positionOfDecisionMaker, udNumber, isDisclosure );

    }

    @After
    public void exit()
    {
        close();
    }

}
