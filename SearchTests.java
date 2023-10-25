import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTests {
    @BeforeAll
    public void init(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 240000;
    @Test
void successfulSearchTest() {
    open("https://www.yandex.ru/");
    $("[name=q]").setValue("selenum").pressEnter();
    $("[id=search]").shouldHave(text("https://selenide.org"));
}
        private static getmessage ()
    }
