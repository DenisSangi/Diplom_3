import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@Data
public class LoginPageSelenide {

    //Локатор поля ввода Емаил
    @FindBy(how = How.CSS, using = "fieldset:nth-child(1) input")
    private SelenideElement emailInputLoginPage;

    //Локатор поля ввода Пароль
    @FindBy(how = How.CSS, using = "fieldset:nth-child(2) input")
    private SelenideElement passwordInputLoginPage;

    //Локатор кнопки Войти
    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    SelenideElement enterButtonLoginPage;

    //локатор ссылки Зарегистрироваться
    @FindBy(how = How.LINK_TEXT, using = "Зарегистрироваться")
    private SelenideElement registerLinkLoginPage;

    //Локатор ссылки Восстановить пароль
    @FindBy(how = How.XPATH, using = "//a[text()='Восстановить пароль']")
    SelenideElement restorePasswordLinkLoginPage;

    //Метод ввода Имя
    public void setEmailInputLoginPage(String email) {
        emailInputLoginPage.setValue(email);
    }

    //Метод ввода Пароля
    public void setPasswordInputFieldLoginPage(String password) {
        passwordInputLoginPage.setValue(password);
    }

    //Метод клика на ссылку Зарегистрирооваться
    public void clickRegisterLinkLoginPage(){
        registerLinkLoginPage.click();
    }

    //Метод клика на ссылку Войти
    public void clickEnterButtonLoginPage(){enterButtonLoginPage.click();
    }

    //Метод клика на ссылку Восстановить пароль
    public void clickRestorePasswordLoginPage(){
        restorePasswordLinkLoginPage.click();
    }

    //проверка что кнопка Войти отображается
    public boolean enterButtonLoginPageIsDisplayed() {
        enterButtonLoginPage.shouldBe(Condition.visible);
        return true;
    }
}