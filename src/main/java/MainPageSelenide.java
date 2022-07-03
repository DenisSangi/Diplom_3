import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;

@Data
public class MainPageSelenide {

    //локатор ссылки Личный кабинет
    @FindBy(how = How.XPATH, using = "//*[text()='Личный Кабинет']")
    SelenideElement accountLinkMainPage;

    //Локатор кнопки Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[text()='Войти в аккаунт']")
    SelenideElement enterAccountButtonMainPage;

    //Локатор кнопки Оформить заказ
    @FindBy(how = How.XPATH, using = "//*[text() = 'Оформить заказ']")
    SelenideElement createOrderButtonMainPage;

    public MainPageSelenide clickAccountLinkMainPage(){
        accountLinkMainPage.click();
        return this;
    }

    public MainPageSelenide clickEnterAccountButtonMainPage() {
        enterAccountButtonMainPage.click();
        return this;
    }

    //проверка что кнопка Оформить заказ отображается
    public boolean createOrderButtonMainPageIsDisplayed() {
        createOrderButtonMainPage.shouldBe(Condition.visible);
        return true;
    }

    //Локатор закладки Булки
    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-default' and text()='Булки']")
    SelenideElement bunsTab;

    //Локатор заголовка Булки
    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-medium mb-6 mt-10' and text()='Булки']")
    SelenideElement bunsText;

    public MainPageSelenide clickBunsTab(){
        bunsTab.click();
        return this;
    }

    //проверка что раздел Булки отображается
    public boolean bunsTabIsDisplayed() {
        bunsText.shouldHave(exactText("Булки"));
        return true;
    }

    //Локатор закладки Соусы
    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-default' and text()='Соусы']")
    SelenideElement sauceTab;

    //Локатор заголовка Соусы
    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-medium mb-6 mt-10' and text()='Соусы']")
    SelenideElement sauceText;

    public MainPageSelenide clickSauceTab(){
        sauceTab.click();
        return this;
    }

    //проверка что раздел Соусы отображается
    public boolean sauceTabIsDisplayed() {
        sauceText.shouldHave(exactText("Соусы"));
        return true;
    }

    //Локатор закладки Начинки
    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-default' and text()='Начинки']")
    SelenideElement fillingTab;

    //Локатор заголовка Начинки
    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-medium mb-6 mt-10' and text()='Начинки']")
    SelenideElement fillingText;

    public MainPageSelenide clickFillingTab(){
        fillingTab.click();
        return this;
    }

    //проверка что раздел Начинки отображается
    public boolean fillingTabIsDisplayed() {
        fillingText.shouldHave(exactText("Начинки"));
        return true;
    }
}
