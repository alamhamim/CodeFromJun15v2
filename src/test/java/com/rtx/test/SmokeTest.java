package com.rtx.test;

import java.io.IOException;

import com.rtx.pages.HomePage;
import com.rtx.pages.MenPage;
import com.rtx.pages.WomanPage;

import org.junit.Test;

public class SmokeTest extends BaseTest{

    HomePage homePage;
    WomanPage womanPage;
    MenPage menPage;

    @Test
    public void testCaseOne() throws IOException, InterruptedException {
        homePage = new HomePage(driver);
        homePage.verifyHomePage();
        womanPage = homePage.clickOnWoman().get();
        menPage = womanPage.clickOneMen();
    }


    
}
