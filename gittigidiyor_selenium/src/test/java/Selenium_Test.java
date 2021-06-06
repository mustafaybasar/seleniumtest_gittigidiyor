import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium_Test {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class=\"gekhq4-4 egoSnI\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()=\"Giriş Yap\"]")).click();
        driver.findElement(By.xpath("//*[@id=\'L-UserNameField\']")).sendKeys("myb_67@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\'L-PasswordField\']")).sendKeys("mustafa_6767");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='gg-login-enter']")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'main-header\']/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("bilgisayar");
        driver.findElement(By.xpath("//*[@id=\'main-header\']/div[3]/div/div/div/div[2]/form/div/div[2]/button")).click();
        driver.findElement(By.xpath("//ul[@class='clearfix']//li[2]//a")).click();
        driver.findElement(By.xpath("//ul[@class='catalog-view clearfix products-container']//li[5]//a")).click();
        driver.findElement(By.xpath("//input[@id=\'add-to-basket\']")).click();
        String productPrice = driver.findElement(By.xpath("//*[@id='sp-price-highPrice']")).getText();
        String basketPrice = driver.findElement(By.xpath("//*[@id=\'cart-item-476733948\']/div[2]/div[5]/div[1]/div[2]/strong")).getText();
        Assert.assertEquals(productPrice,basketPrice);
        System.out.println("ürün fiyatları esit");




    }

}
