package praktikum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static driver.WebDriverCreator.createWebDriver;

public class OpenPageTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = createWebDriver();
    }

    @Test
    public void test() {
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
