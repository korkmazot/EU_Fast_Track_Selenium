package Day4;

import Day3.BasePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Upload extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/upload");
    }

    @Test
    public void test1(){
        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys("C:\\Users\\omert\\IdeaProjects\\EUFastTrackSelenium\\src\\test\\java\\Utilities\\aws.pdf");
        driver.findElement(By.id("file-submit")).click();
    }
}
