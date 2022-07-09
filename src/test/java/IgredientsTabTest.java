import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IgredientsTabTest extends BaseData{

    //проверка перехода к соусам
    @Test
    public void sauceTabTest() {

        mainPage.clickSauceTab();
        assertTrue(mainPage.sauceTabIsDisplayed());
    }

    //проверка перехода к булкам
    @Test
    public void bunsTabTest() {

        mainPage.clickFillingTab();
        mainPage.clickBunsTab();
        assertTrue(mainPage.bunsTabIsDisplayed());
    }

    //проверка перехода к начинкам
    @Test
    public void fillingTabTest() {

        mainPage.clickFillingTab();
        assertTrue(mainPage.fillingTabIsDisplayed());
    }
}
