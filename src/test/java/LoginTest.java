import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



import static com.codeborne.selenide.selector.ByDeepShadow.cssSelector;



public class LoginTest {


    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";



    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $(cssSelector("[id=firstName]")).setValue("Sam");
        $(cssSelector("[id=lastName]")).setValue("James");
        $(cssSelector("[id=userEmail]")).setValue("Sam@gmail.com");
        $(cssSelector("[id=userEmail]")).setValue("Sam@gmail.com");
        $(byText("Male")).click();
        $(cssSelector("[id=userNumber]")).setValue("9956158955");
        $("[id=dateOfBirth-wrapper]").click();

        $("[id=subjectsContainer]").click();
        $("[id=subjectsInput]").click();
        $(byText("Music")).click();
        $(byText("Select picture")).click();
        $(byText("Current Address")).click();
        $("[class=form-control]").setValue("Sammy");
        $("[class=form-label]").scrollTo();
        $("[id=state]").click();
        $(byText("NCR")).click();
        $("[id=city]").click();
        $(byText("Delhi")).click();
        $("[id=submit]").click();




    }
}
