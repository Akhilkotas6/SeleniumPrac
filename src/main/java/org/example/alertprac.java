package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertprac {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        //alert box
        driver.findElement(By.id("alertBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        //confirm box
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        //driver.findElement(By.id("output")).getText();
        Thread.sleep(3000);
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());
        //promptbox
        JavascriptExecutor js = (JavascriptExecutor) driver;

      /*  WebElement footer = driver.findElement(By.xpath("//button[@id='promptBox']"));
        driver.manage().window(). .script("arguments[0].scrollIntoView(true);", footer);
        Thread.sleep(3000);*/
        WebElement promtele = driver.findElement(By.xpath("//button[@id='promptBox']"));
        js.executeScript("arguments[0].scrollIntoView();", promtele);
        //driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        promtele.click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Akhil Kota");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        //driver.findElement(By.id("output")).getText();
        Thread.sleep(3000);
        //driver.findElement(By.id("confirmBox")).click();
        promtele.click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();
        


    }
}
