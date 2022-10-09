package Day4;

import Day3.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecuter extends BasePage {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement link = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",link);
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String text = "Hello Disabled Input";
        jse.executeScript("arguments[0].setAttiribute('value','' + text + '')", inputBox);
    }
}
