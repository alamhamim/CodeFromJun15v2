package com.rtx.pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.rtx.headerNFooter.VerifyPages;
import com.rtx.utility.SeleniumHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class WomanPage extends LoadableComponent<WomanPage>{

   public WebDriver driver;
    Properties properties;


    public WomanPage(WebDriver driver) throws IOException{
        this.driver = driver;
        properties = SeleniumHelper.readProperties("Pagedata/womanpageData.properties");
        PageFactory.initElements(driver, this);

        
    }

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ol[1]/li/a[1]") List<WebElement> allCategories;

    public MenPage clickOneMen() throws InterruptedException {
        SeleniumHelper.getTitle(driver);
        Thread.sleep(5000);
        SeleniumHelper.click(allCategories, properties.getProperty("givenText"));
        return new MenPage(driver);
    }

    @Override
    protected void load() {
        VerifyPages verifyPages = new VerifyPages(driver);
        driver.navigate().to(properties.getProperty("womanPageUrl"));
        
    }

    @Override
    protected void isLoaded() throws Error {
    //    Can use assert method 
    VerifyPages verifyPages = new VerifyPages(driver);
    
        
        
    }

}
