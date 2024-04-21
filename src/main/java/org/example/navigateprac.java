package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateprac {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);
        driver.get("https://twitter.com/");
        Thread.sleep(3000);
        driver.get("https://www.cricbuzz.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("test@yopmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(5000);

        driver.quit();


    }
}
