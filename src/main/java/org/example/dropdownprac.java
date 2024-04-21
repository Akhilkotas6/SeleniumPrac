package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownprac {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement courseddele = driver.findElement(By.id("course"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", courseddele);
        Select coursedd = new Select(courseddele);
        coursedd.selectByValue("java");
        Thread.sleep(3000);
        System.out.println(coursedd.getFirstSelectedOption().getText() );
        coursedd.selectByIndex(3);
        Thread.sleep(3000);
        System.out.println(coursedd.getFirstSelectedOption().getText() );
        coursedd.selectByVisibleText("Dot Net");
        Thread.sleep(3000);
        System.out.println(coursedd.getFirstSelectedOption().getText() );
        List<WebElement> courseddopt = coursedd.getOptions();
        for(WebElement option : courseddopt){
            if(!option.getText().equals("Select")) {
                System.out.println(option.getText());
            }
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
