package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testframes {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("manin frame 1");
        Thread.sleep(5000);
        driver.switchTo().frame("frm1");

        Select coursename_dd = new Select(driver.findElement(By.id("course")));
        coursename_dd.selectByVisibleText("Java");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("moved from frm1 to main frame");
        //WebElement firstname = driver.findElement(By.id("firstName"));

        driver.switchTo().frame("frm2");
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("i am in frame 2");
        Thread.sleep(5000);

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("moved from frame2 to main frame");

        driver.switchTo().frame("frm1");
        coursename_dd.selectByVisibleText("Dot Net");
        Thread.sleep(5000);

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("moved from frm1 to main frame");
        Thread.sleep(5000);

        driver.quit();







    }
}
