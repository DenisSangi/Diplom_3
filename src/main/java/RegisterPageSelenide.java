import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@Data
public class RegisterPageSelenide {


    //Локатор поля ввода Имя
    @FindBy(how = How.CSS, using = "fieldset:nth-child(1) input")
    private SelenideElement nameInputFieldRegisterPage;

    //Локатор поля ввода Емаил
    @FindBy(how = How.CSS, using = "fieldset:nth-child(2) input")
    private SelenideElement emailInputFieldRegisterPage;

    //Локатор поля ввода Пароль
    @FindBy(how = How.CSS, using = "fieldset:nth-child(3) input")
    private SelenideElement passwordInputFieldRegisterPage;

    //Локатор кнопки Зарегистрироваться
    @FindBy(how = How.XPATH, using = "//*[text()='Зарегистрироваться']")
    SelenideElement registrationButtonRegisterPage;

    //Локатор кнопки Войти
    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    SelenideElement enterButtonRegisterPage;

    //Локатор ошибки при некрректном пароле
    @FindBy(how = How.XPATH, using = "//*[text()='Некорректный пароль']")
    SelenideElement incorrectPasswordError;

    //Метод ввода имени
    public void setNameInputFieldRegisterPage(String name) {
        nameInputFieldRegisterPage.setValue(name);
    }

    //Метод ввода Емаил
    public void setEmailInputFieldRegisterPage(String email) {
        emailInputFieldRegisterPage.setValue(email);
    }

    //Метод ввода Пароля
    public void setPasswordInputFieldRegisterPage(String password) {
        passwordInputFieldRegisterPage.setValue(password);
    }

    //Метод нажатия кнопки Зарегистрироваться
    public void clickRegistrationButton(){
        registrationButtonRegisterPage.click();
    }

    //Метод нажатия кнопки Войти
    public void clickEnterButtonRegisterPage(){
        enterButtonRegisterPage.click();
    }

    //проверка что кнопка Зарегистрироваться отображается
    public boolean registerButtonIsDisplayed() {
        registrationButtonRegisterPage.shouldBe(Condition.visible);
        return true;
    }
}