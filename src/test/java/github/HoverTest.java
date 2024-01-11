package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverTest {

    @Test
    void shouldFindPageWithHeadingTest() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));

    }
}
