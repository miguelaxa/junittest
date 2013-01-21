package com.mac.example;
import com.thoughtworks.selenium.*;
import java.io.File;

import jxl.*;


import org.openqa.selenium.server.SeleniumServer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Seltest extends SeleneseTestBase{
    
    @BeforeClass
    public void setUp() throws Exception {
        SeleniumServer seleniumserver=new SeleniumServer();
        seleniumserver.boot();
        seleniumserver.start();
        setUp("http://www.imdb.com/", "*firefox");
        selenium.open("/");
        selenium.windowMaximize();
        selenium.windowFocus();
    }

     
    
    @Test ()
    public void testDataProviderExample()throws Exception { 
    		String movieTitle = "mac"; 
            String directorName= "mac"; 
            String moviePlot= "mac"; 
            String actorName= "mac";  
        //enter the movie title 
        selenium.type("q", movieTitle);
        //they keep switching the go button to keep the bots away
        if (selenium.isElementPresent("nb15go_image"))
            selenium.click("nb15go_image");
        else
        selenium.click("xpath=/descendant::button[@type='submit']");
        
        selenium.waitForPageToLoad("30000");
        //click on the movie title in the search result page
        selenium.click("xpath=/descendant::a[text()='"+movieTitle+"']");
        selenium.waitForPageToLoad("30000");
        //verify director name is present in the movie details page 
        verifyTrue(selenium.isTextPresent(directorName));
        //verify movie plot is present in the movie details page
        verifyTrue(selenium.isTextPresent(moviePlot));
        //verify movie actor name is present in the movie details page
        verifyTrue(selenium.isTextPresent(actorName));
    }
    
    @AfterClass
    public void tearDown(){
        selenium.close();
        selenium.stop();
    } 
    
        
}//end of class