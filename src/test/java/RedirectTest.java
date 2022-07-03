import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.assertTrue;

public class RedirectTest {

    //Page objects
    MainPageSelenide mainPage = open("https://stellarburgers.nomoreparties.site/", MainPageSelenide.class);
    LoginPageSelenide loginPage = page(LoginPageSelenide.class);
    AccountPageSelenide accountPage = page(AccountPageSelenide.class);

    /*Разкомменитровать для тестирования в Safari
    @BeforeClass
    public static void setProperties() {
        Configuration.browser = "safari";
    }*/

    //проверка перехода в личный кабинет
    @Test
    public void enterAccountTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        assertTrue(accountPage.exitButtonIsDisplayed());
        accountPage.clickExitButton();
        getWebDriver().quit();
    }

    //проверка перехода из личного кабинета в конструктор 1
    @Test
    public void fromAccountToConstructorViaConstructorLinkTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        assertTrue(accountPage.exitButtonIsDisplayed());
        accountPage.clickConstructorLink();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        accountPage.clickExitButton();
        getWebDriver().quit();
    }

    //проверка перехода из личного кабинета в конструктор 2
    @Test
    public void fromAccountToConstructorViaLogoLinkTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        assertTrue(accountPage.exitButtonIsDisplayed());
        accountPage.clickLogoLink();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        accountPage.clickExitButton();
        getWebDriver().quit();
    }

    //проверка выхода из личного кабинета
    @Test
    public void logoutFromAccountTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        assertTrue(accountPage.exitButtonIsDisplayed());
        accountPage.clickExitButton();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        getWebDriver().quit();
    }

    //проверка перехода к соусам
    @Test
    public void sauceTabTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickSauceTab();
        assertTrue(mainPage.sauceTabIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        accountPage.clickExitButton();
        getWebDriver().quit();
    }

    //проверка перехода к булкам
    @Test
    public void bunsTabTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickSauceTab();
        assertTrue(mainPage.sauceTabIsDisplayed());
        mainPage.clickBunsTab();
        assertTrue(mainPage.bunsTabIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        accountPage.clickExitButton();
        getWebDriver().quit();
    }

    //проверка перехода к начинкам
    @Test
    public void fillingTabTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
        mainPage.clickFillingTab();
        assertTrue(mainPage.fillingTabIsDisplayed());
        mainPage.clickAccountLinkMainPage();
        accountPage.clickExitButton();
        getWebDriver().quit();
    }
}
