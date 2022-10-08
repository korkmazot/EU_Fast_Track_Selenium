package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class Windows extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void test1(){
        driver.findElement(By.xpath("//a[@href=\"/windows/new\"]"));
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles){
            System.out.println(driver.switchTo().window(handle).getCurrentUrl());
            System.out.println(driver.switchTo().window(handle).getTitle());
        }

        driver.close();
    }

}
