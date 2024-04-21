package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindowhandle {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
