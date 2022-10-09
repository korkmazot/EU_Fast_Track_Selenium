package Day4;

import Day3.BasePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;

import java.util.List;

public class Hover extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/hovers");
    }

    @Test
    public void test1() throws InterruptedException {
        Actions actions = new Actions(driver);
        List<WebElement> hovers = driver.findElements(By.cssSelector(".figure"));
          for (WebElement hover : hovers){
              actions.moveToElement(hover).perform();
              Thread.sleep(2000);
          }
    }

}
