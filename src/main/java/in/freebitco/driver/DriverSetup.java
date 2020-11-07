package in.freebitco.driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public interface DriverSetup {

    Capabilities getBrowserCapabilities();

    Object getBrowserOptions();

    WebDriver getWebDriver();
}
