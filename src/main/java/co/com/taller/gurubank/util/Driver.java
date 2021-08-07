package co.com.taller.gurubank.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;

    public static Driver getDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        return new Driver();
    }

    public WebDriver openUrl(String url){
        driver.get(url);
        return driver;
    }

    public static WebDriverWait waitObject(){
        return new WebDriverWait(driver, 3);
    }

    public static Alert getAlert(){
        return driver.switchTo().alert();
    }
}
