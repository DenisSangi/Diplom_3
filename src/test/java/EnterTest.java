import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EnterTest extends BaseData {
    /*Раскомменитровать для тестирования в Safari
    @BeforeClass
    public static void setProperties() {
        Configuration.browser = "safari";
    }*/

    @After
    public void tearDown() {
        closeDriver();
    }

    //проверка входа через кнопку Войти в аккаунт
    @Test
    public void enterAccountButtonTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
    }

    //проверка входа через ссылку Личный кабинет
    @Test
    public void enterAccountLinkTest() {

        mainPage.clickAccountLinkMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
    }

    //проверка входа через кнопку в форме регистрации
    @Test
    public void enterAccountViaRegistrationTest() {

        mainPage.clickAccountLinkMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.clickRegisterLinkLoginPage();
        assertTrue(registerPage.registerButtonIsDisplayed());
        registerPage.clickEnterButtonRegisterPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
    }

    //проверка входа через кнопку в форме восстановления пароля
    @Test
    public void enterViaRestorePasswordTest() {

        mainPage.clickAccountLinkMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.clickRestorePasswordLoginPage();
        assertTrue(restorePassword.enterButtonIsDisplayed());
        restorePassword.clickEnterButton();
        assertTrue(loginPage.enterButtonLoginPage.isDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
    }
}
