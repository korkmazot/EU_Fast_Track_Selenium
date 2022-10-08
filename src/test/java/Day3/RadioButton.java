package Day3;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @Test
    public void test1(){
        WebElement redBtn = driver.findElement(By.id("red"));
        redBtn.click();
    }

    @Test
    public void test3() throws InterruptedException {
        List<WebElement> btns = driver.findElements(By.xpath("//input[@type='radio']"));
        for(WebElement btn : btns){
            System.out.println(btn.getText());
            btn.click();
            Thread.sleep(1000);
        }
    }
}
