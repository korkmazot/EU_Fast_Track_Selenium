package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDown extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void test1(){
        WebElement firstDrop = driver.findElement(By.id("dropdown"));
        Select select = new Select(firstDrop);
        select.selectByIndex(1);

        WebElement yearDown = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDown);
        yearSelect.selectByValue("2017");

        WebElement stateDrop = driver.findElement(By.id("state"));
        Select stateSelect = new Select(stateDrop);
        stateSelect.selectByVisibleText("Arizona");
    }

    @Test
    public void test2(){
        WebElement languagesDrop = driver.findElement(By.name("Languages"));
        Select lanSelect = new Select(languagesDrop);
        System.out.println(lanSelect.isMultiple());
        System.out.println(lanSelect.getAllSelectedOptions().size());

        lanSelect.selectByValue("java");
        lanSelect.selectByValue("js");
        lanSelect.selectByValue("phyton");
        System.out.println(lanSelect.getAllSelectedOptions().size());

    }
}
