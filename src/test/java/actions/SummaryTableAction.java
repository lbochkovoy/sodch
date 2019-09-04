package actions;

import locators.SummaryTableLocator;

public class SummaryTableAction extends TableAction {

    public static void clickOnAppendButton()
    {
        SummaryTableLocator.createButton().click();
    }

}
