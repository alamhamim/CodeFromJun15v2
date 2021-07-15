package com.rtx.pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.rtx.utility.SeleniumHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    Properties properties;

    public HomePage(WebDriver driver) throws IOException{
        this.driver = driver;
        properties = SeleniumHelper.readProperties("Pagedata/homepageData.properties");
        PageFactory.initElements(driver, this);
    }

    // All the element path are here
    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/img[1]") WebElement homePageLogo;
    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ol[1]/li/a[1]") List<WebElement> allCaList;
    @FindBy(xpath = "//button[@id='closeModal']") WebElement popUp;
    
    public void verifyHomePage() throws InterruptedException {
        SeleniumHelper.getTitle(driver);
        SeleniumHelper.verifyUrl(driver, properties.getProperty("homepageUrl"));
        Thread.sleep(5000);
        SeleniumHelper.popUpKiller(popUp);
        Thread.sleep(5000);
        SeleniumHelper.verifyLogo(homePageLogo);
    }
/* 
    public void clickTest() {
        SeleniumHelper.click(allCaList, driver);
    }
 */
    public WomanPage clickOnWoman() throws IOException {
        SeleniumHelper.click(allCaList, properties.getProperty("givenText"));
        return new WomanPage(driver);
    }

}
