package com.rtx.headerNFooter;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPages {

    WebDriver driver;

    public VerifyPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "header") WebElement headerElement;
    @FindBy(xpath = "footer") List<WebElement> footerElements;


    

    
}
