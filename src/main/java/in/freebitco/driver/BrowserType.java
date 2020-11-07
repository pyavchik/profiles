package in.freebitco.driver;

import in.freebitco.util.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import static in.freebitco.util.Helper.isWebDriverManager;

public enum BrowserType implements DriverSetup{

    FIREFOX1 {
        @Override
        public Capabilities getBrowserCapabilities() {

            Capabilities capabilities = getBrowserOptions();
            return capabilities;
        }

        @Override
        public FirefoxOptions getBrowserOptions() {

            FirefoxOptions firefoxOptions = new FirefoxOptions();
            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile myprofile = profile.getProfile("xyzProfile");

            //Set Firefox profile to capabilities
            firefoxOptions.setCapability(FirefoxDriver.PROFILE, myprofile);
            return  firefoxOptions;
        }

        @Override
        public WebDriver getWebDriver() {

            String browserPath = Helper.getBrowserPath();

            if(isWebDriverManager() ){
                WebDriverManager.firefoxdriver().setup();
            }
            else{
                System.setProperty("webdriver.gecko.driver",
                        browserPath);
            }

            FirefoxOptions firefoxOptions = getBrowserOptions();
            return new FirefoxDriver(firefoxOptions);
        }
        }
    ,
    FIREFOX2 {
        @Override
        public Capabilities getBrowserCapabilities() {

            Capabilities capabilities = getBrowserOptions();
            return capabilities;
        }

        @Override
        public FirefoxOptions getBrowserOptions() {

            FirefoxOptions firefoxOptions = new FirefoxOptions();
            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile myprofile = profile.getProfile("xyzProfile2");

            //Set Firefox profile to capabilities
            firefoxOptions.setCapability(FirefoxDriver.PROFILE, myprofile);
            return  firefoxOptions;
        }

        @Override
        public WebDriver getWebDriver() {

            String browserPath = Helper.getBrowserPath();

            if(isWebDriverManager() ){
                WebDriverManager.firefoxdriver().setup();
            }
            else{
                System.setProperty("webdriver.gecko.driver",
                        browserPath);
            }

            FirefoxOptions firefoxOptions = getBrowserOptions();
            return new FirefoxDriver(firefoxOptions);
        }
    }
};
