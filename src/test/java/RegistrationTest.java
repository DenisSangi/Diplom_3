import com.codeborne.selenide.Configuration;
import org.apache.commons.lang3.RandomStringUtils;

import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import static org.junit.Assert.assertTrue;


public class RegistrationTest {

    //Page objects
    MainPageSelenide mainPage = open("https://stellarburgers.nomoreparties.site/", MainPageSelenide.class);
    LoginPageSelenide loginPage = page(LoginPageSelenide.class);
    RegisterPageSelenide registerPage = page(RegisterPageSelenide.class);

    //User data
    private final String name = RandomStringUtils.randomAlphanumeric(10);
    private final String email = name + "@gmail.com";
    private final String password = RandomStringUtils.randomAlphanumeric(6);
    private final String incorrectPassword = RandomStringUtils.randomAlphanumeric(5);

    /*Разкомменитровать для тестирования в Safari
    @BeforeClass
    public static void setProperties() {
        Configuration.browser = "safari";
    }*/

    //проверка успешной регистрации
    @Test
    public void registrationTest() {

        mainPage.clickAccountLinkMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.clickRegisterLinkLoginPage();
        assertTrue(registerPage.registerButtonIsDisplayed());
        registerPage.setNameInputFieldRegisterPage(name);
        registerPage.setEmailInputFieldRegisterPage(email);
        registerPage.setPasswordInputFieldRegisterPage(password);
        registerPage.clickRegistrationButton();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
    }

    //проверка ошибки при некорректном пароле
    @Test
    public void incorrectPasswordErrorTest() {

        mainPage.clickAccountLinkMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.clickRegisterLinkLoginPage();
        assertTrue(registerPage.registerButtonIsDisplayed());
        registerPage.setNameInputFieldRegisterPage(name);
        registerPage.setEmailInputFieldRegisterPage(email);
        registerPage.setPasswordInputFieldRegisterPage(incorrectPassword);
        registerPage.clickRegistrationButton();
        assertTrue(registerPage.incorrectPasswordError.isDisplayed());
    }
}
