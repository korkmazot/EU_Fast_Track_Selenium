package Day4;

import Day3.BasePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Frames extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
    }

    @Test
    public void test1(){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);     //frameborder =1
        System.out.println(driver.findElement(By.cssSelector("#content")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.name("frame-top")).getAttribute("src"));
    }
}
