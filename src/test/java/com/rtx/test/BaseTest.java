package com.rtx.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;


public class BaseTest {

    WebDriver driver;

    @Before
    public void browserDefault() throws IOException {
        FileInputStream file = new FileInputStream("Pagedata/browserdata.properties");
        Properties properties = new Properties();
        properties.load(file);
        
        String getBrowser = System.getProperty("browser");

        if (getBrowser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(properties.getProperty("URL"));
        } else if (getBrowser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(properties.getProperty("URL"));
        } else if (getBrowser.equalsIgnoreCase("opera")) {
            System.setProperty("webdriver.opera.driver", "driver/operadriver");
            driver = new OperaDriver();
            driver.manage().window().maximize();
            driver.get(properties.getProperty("URL"));
        } else if (getBrowser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get(properties.getProperty("URL"));
        } else {
            System.out.println("Sorry Your Browser Is Not Supported");
        }
    }

    @After
    public void doneTesting() {
        driver.quit();
    }

}
