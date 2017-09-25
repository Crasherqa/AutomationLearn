package ua.org.autotest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Crasher on 17.09.2017.
 */
public class FirsTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "E://QA/Automation/File/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ukr.net/desktop/login");
    }

    @Test
    public void userLogin() {
        WebElement loginField = driver.findElement(By.id("id-1"));
        loginField.sendKeys("autotestorgua");
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}
