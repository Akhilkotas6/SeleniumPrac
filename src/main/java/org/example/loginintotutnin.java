


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginintotutnin
{
    @Test
    public void verifylogintitutnin()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("test678@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@678");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed());




    }
}