package netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallbackTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
        System.setProperty("webdriver.chrome.driver", "D:\\progy\\Forjava\\Projects\\TestWebinterfaces\\driver\\win\\chromedriver.exe");
    }

    @BeforeEach
    void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
        driver = null;
    }

    @Test
    void sendFormSuccess() {
        driver.get("http://localhost:9999/");
       /* driver.findElement().sendKeys("Мак Василий");
        driver.findElement().findElement("+79124380000");
        driver.findElement().click();
        driver.findElement().click();
        String expected = " Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время";
        String actual = driver.findElement().getText();
        assertEquals(expected, actual);*/
    }
}
