package Day3;

import Utilities.Driver;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(){

        driver = Driver.get();
        driver.manage().window().maximize();
    }

}
