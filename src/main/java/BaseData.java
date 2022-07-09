import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

abstract class BaseData {
    MainPageSelenide mainPage = open("https://stellarburgers.nomoreparties.site/", MainPageSelenide.class);
    AccountPageSelenide accountPage = page(AccountPageSelenide.class);
    LoginPageSelenide loginPage = page(LoginPageSelenide.class);
    RegisterPageSelenide registerPage = page(RegisterPageSelenide.class);
    RestorePasswordPageSelenide restorePassword = page(RestorePasswordPageSelenide.class);

    public void closeDriver() {
        mainPage.clickAccountLinkMainPage();
        accountPage.clickExitButton();
        getWebDriver().quit();
    }
}
