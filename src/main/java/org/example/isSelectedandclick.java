package org.example;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class isSelectedandclick {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        WebElement maleradbtn = driver.findElement(By.id("malerb"));
        WebElement femaleradbtn = driver.findElement(By.id("femalerb"));

        if(maleradbtn.isSelected()){
            femaleradbtn.click();

        }else{
            maleradbtn.click();
        }
        Thread.sleep(3000);
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("hindichbx")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("hindichbx")).click();
        Thread.sleep(3000,5);
        driver.close();






    }
}
