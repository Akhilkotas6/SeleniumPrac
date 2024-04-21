package org.example;
//specifies the package wher this class is available

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class textboxprac {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.id("login_field"));
        if(username.isDisplayed()){
            if(username.isEnabled()){
                username.sendKeys("Akhil");
                Thread.sleep(5000);
                System.out.println(username.getAttribute("value"));
                username.clear();
                username.sendKeys("Kota");
                System.out.println(username.getAttribute("value"));

            }
            else{
                System.out.println("Username field is displayed but not enabled");
            }

        }
        else {
            System.out.println("Username field is not displayed");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
