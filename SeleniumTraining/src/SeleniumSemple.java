import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Crasher on 15.07.2017.
 */
public class SeleniumSemple {

    public static void main (String []args){
        System.setProperty("webdriver.gecko.driver","E:\\QA\\Automation\\SeleniumProject\\File\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://pdr.hsc.gov.ua/test-pdd/uk/");
        driver.quit();

    }

}
