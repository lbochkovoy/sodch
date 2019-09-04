package actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class BaseAction {

    public static void setValueOnList(SelenideElement element, String value )
    {
        element.setValue( value );
        $x(".//div[ contains( @id, 'boundlist' ) ]").shouldBe( Condition.exist );
        element.pressEnter();
    }
}
