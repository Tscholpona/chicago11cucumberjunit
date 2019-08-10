package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){ //we have it to be

    }
    private static WebDriver driver;
    public static WebDriver getDriver(){
        //here we create driver instance if it is null
        if(driver == null){
            String browser = Config.getProperty("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();//boniegarcia
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();//boniegarcia
                driver = new FirefoxDriver();
            } else {
                WebDriverManager.chromedriver().setup();//boniegarcia
                driver = new ChromeDriver();
            }
            driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            driver.manage().window().maximize();


        }
        return driver;//it means it is not null
    }
    public static void quitDriver(){
        if(driver!= null){
            driver.quit();//means we want to quit from whole session  close means to close all
            driver=null;
        }
    }
}
