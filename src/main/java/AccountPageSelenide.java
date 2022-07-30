import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPageSelenide {

    //Локатор кнопки Выход
    @FindBy(how = How.XPATH, using = "//*[text()='Выход']")
    SelenideElement exitButton;

    //Локатор ссылки Конструктор
    @FindBy(how = How.XPATH, using = "//*[text()='Конструктор']")
    SelenideElement constructorLink;

    //Локатор логотипа Stellar Burgers
    @FindBy(how = How.XPATH, using = "//*[@class='AppHeader_header__logo__2D0X2']")
    SelenideElement logoLink;

    public AccountPageSelenide clickExitButton() {
        exitButton.click();
        return this;
    }

    public AccountPageSelenide clickConstructorLink() {
        constructorLink.click();
        return this;
    }

    public AccountPageSelenide clickLogoLink() {
        logoLink.click();
        return this;
    }

    //проверка что кнопка Выход отображается
    public boolean exitButtonIsDisplayed() {
        exitButton.shouldBe(Condition.visible);
        return true;
    }
}