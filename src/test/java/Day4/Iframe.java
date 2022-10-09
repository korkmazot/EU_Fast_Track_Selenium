package Day4;

import Day3.BasePage;
import Utilities.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    //get frame by WebElement
    @Test
    public void test1() throws InterruptedException {
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        driver.findElement(By.id("tinymce")).getTagName();
    }

    //get frame by index number
    @Test
    public void test2(){
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.id("tinymce")).getTagName());
    }

    //get frame by name/id
    @Test
    public void test3(){
        driver.switchTo().frame("mce_0_ifr");
        System.out.println(driver.findElement(By.id("tinymce")).getTagName());
    }

}
