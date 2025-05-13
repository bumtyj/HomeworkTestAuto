import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.io.File;

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
    void successfulRegistrationTest() {
        open("/automation-practice-form");

        $(cssSelector("[id=firstName]")).setValue("Sam");
        $(cssSelector("[id=lastName]")).setValue("James");
        $(cssSelector("[id=userEmail]")).setValue("Sam@gmail.com");
        $(cssSelector("[id=userEmail]")).setValue("Sam@gmail.com");
        $(byText("Male")).click();
        $(cssSelector("[id=userNumber]")).setValue("9956158955");
        $("[id=dateOfBirth-wrapper]").click();
        $("[class=react-datepicker__month-select]").selectOption("July");
        $("[class=react-datepicker__year-select]").selectOption("1997");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("[id=subjectsContainer]").click();
        $("[id=subjectsInput]").click();
        $(byText("Music")).click();
        File uploadFile = $("[id=uploadPicture]").uploadFile(new File("src/test/java/resourses/1.png"));
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
