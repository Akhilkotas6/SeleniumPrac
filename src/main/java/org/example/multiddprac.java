package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multiddprac {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement ideddele = driver.findElement(By.id("ide"));
        Select idedd = new Select(ideddele);
        List<WebElement> ideddopt = idedd.getOptions();
        for(WebElement opt : ideddopt){
            System.out.println(opt.getText());
        }
        idedd.selectByVisibleText("Eclipse");
        Thread.sleep(3000);
        idedd.selectByIndex(1);
        Thread.sleep(3000);
        idedd.selectByValue("nb");
        List<WebElement> selopts = idedd.getAllSelectedOptions();
        for(WebElement selopt : selopts){
            System.out.println(selopt.getText());
        }
        driver.quit();
    }
}
