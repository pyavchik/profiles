package in.freebitco;

import in.freebitco.driver.DriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends DriverManager {
    WebDriver driver;
    @Test
    public void login(){
        driver = getDriver();
        driver.get("https://freebitco.in/");
    }
}
