import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RestorePasswordPageSelenide {

    //Локатор кнопки Войти
    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    SelenideElement enterButtonRestorePasswordPage;

    public RestorePasswordPageSelenide clickEnterButton() {
        enterButtonRestorePasswordPage.click();
        return this;
    }

    //проверка что кнопка Войти отображается
    public boolean enterButtonIsDisplayed() {
        enterButtonRestorePasswordPage.shouldBe(Condition.visible);
        return true;
    }
}