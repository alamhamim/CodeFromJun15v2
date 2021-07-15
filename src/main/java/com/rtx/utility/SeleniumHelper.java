package com.rtx.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {

    public static String getTitle(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println(title);
        return title;
        
    }

    public static void verifyUrl(WebDriver driver, String url) {
        if (driver.getCurrentUrl().contains(url)) {
            System.out.println("URL verified");
        } else {
            System.out.println("Can not verify the URL!");
        }
    }

    public static WebElement doAnyAction(WebElement element) {
        return element;
    }
    
    public static void click(WebElement element) {
        element.click();
    }

    public static void click(List<WebElement> elements, int index) {
        elements.get(index).click();
    }

    public static void click(List<WebElement> elements, String textString) {
        for (WebElement webElement : elements) {
            if (webElement.getText().equals(textString)) {
                webElement.click();
                break;
            }
        }
    }

    public static void click(List<WebElement> elements, WebDriver driver, String textString) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(textString)) {
                continue;
                
            } else {
                elements.get(i).click();
                driver.navigate().back();
                driver.navigate().refresh();
            }
            
        }
    }

    public static void click(List<WebElement> elements, WebDriver driver) {
        for (WebElement webElement : elements) {
            webElement.click();
            driver.navigate().back();
        }
    }

    public static void verifyPrice(WebElement one, WebElement two, float f) {
        // These two lines are for the old price
        String oldPrice = one.getText();
        int priceOne = Integer.parseInt(oldPrice.replaceAll("$", ""));

        // These two lines are for the newPrice
        String newPrice = two.getText();
        int priceTwo = Integer.parseInt(newPrice.replaceAll("$", ""));

        if (priceOne*f==priceTwo) {
            System.out.println("Price verified");
        } else {
            System.out.println("Can't verify the price'");
        }
        
    }

    public static void popUpKiller(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("POP UP");
            element.click();
        } else {
            System.out.println("NO POP UP");
        }
    }

    public static Properties readProperties(String path) throws IOException {
        FileInputStream file = new FileInputStream(new File(path));
        Properties properties = new Properties();
        properties.load(file);
        return properties;
        
    }

    public static void verifyLogo(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("Logo is displayed");
            element.click();
        }else{
            System.out.println("Can not verify the Logo");

        }
    }


}
