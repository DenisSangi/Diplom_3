import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class RedirectTest extends BaseData {

    /*Разкомменитровать для тестирования в Safari
    @BeforeClass
    public static void setProperties() {
        Configuration.browser = "safari";
    }*/

    @After
    public void tearDown() {
        closeDriver();
    }
    //проверка перехода в личный кабинет
    @Test
    public void enterAccountTest() {

        mainPage.clickEnterAccountButtonMainPage();
        assertTrue(loginPage.enterButtonLoginPageIsDisplayed());
        loginPage.setEmailInputLoginPage("ds@gmail.com");
        loginPage.setPasswordInputFieldLoginPage("Qwer1234");
        loginPage.clickEnterButtonLoginPage();
        assertTrue(mainPage.createOrderButtonMainPageIsDisplayed());
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
    }
}
