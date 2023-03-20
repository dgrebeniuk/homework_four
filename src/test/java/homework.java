
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class homework {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
   }

   @Test
   void softAssertions() {

      open("https://github.com/selenide/selenide");

      $("#wiki-tab").click();
      $(".js-wiki-more-pages-link").click();
      $(byLinkText("SoftAssertions")).click();
      $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

   }
}
