package objects;

import actions.VisibilityChecker;

import static com.codeborne.selenide.Selenide.sleep;

public class SummaryCreator {

    public static void createSummary( )
    {
        VisibilityChecker.checkSummaryFormVisibility();
        actions.SummaryFormAction.setAccidentType("Аварии в городском хозяйстве");
        actions.SummaryFormAction.setFabula( "ФАБУЛА_1");
        actions.SummaryFormAction.setTypeOfCrime("Бандитизм");

        actions.SummaryFormAction.clickOnToolMenu("Предметы");
        actions.SummaryFormAction.ObjectsToolMenu.setConfiscted("Предмет_1");

        actions.SummaryFormAction.clickOnToolMenu("Решение");
        actions.SummaryFormAction.DecisionToolMenu.clickOnInitiateUdCheckbox();
        actions.SummaryFormAction.DecisionToolMenu.setLastName("Фамилия");
        actions.SummaryFormAction.DecisionToolMenu.setPositionOfDecisionMaker("Аналитик");
        actions.SummaryFormAction.DecisionToolMenu.setUdNumber("111");
        actions.SummaryFormAction.DecisionToolMenu.setDisclosureType( false );

        actions.SummaryFormAction.clickOnToolMenu("Выезжали");
        actions.SummaryFormAction.OperGroupToolMenu.setSogComposition("111 222 333 444 \n 555 666 ");

        actions.SummaryFormAction.clickOnToolMenu("Лица");
        actions.SummaryFormAction.People.clickOnAppendButton();
        actions.SummaryFormAction.People.setLastName("Иванов");
        actions.SummaryFormAction.People.setParticipationType("Посещает");
        actions.SummaryFormAction.People.clickSaveButton();

        actions.SummaryFormAction.clickOnSaveButton();
    }
}
