package com.zestmoney.assigment3;

import comm.framework.TestBaseTest;
import comm.pageobject.zestmoney.assigment3.TripHomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TripHomeTest extends TestBaseTest {

    public static TripHomePage tripHomePage;

    @BeforeTest
    public static void initialSetpUp() {
        initialSetup();
        tripHomePage = new TripHomePage(getdriver());
    }

    /*  @AfterClass
       public static void closeAfterTest(){
          if(driver != null){
              Logger.info("Closing the WebDriver");
              driver.close();
              driver.quit();
          }
      }*/
    @Test(priority = 1)
    public static void verifyLaunchHomePage() throws InterruptedException {
        tripHomePage.verifyLaunchHomePage();
    }

    @Test(priority = 2, enabled = true)
    public static void verifySelection() {
        tripHomePage.verifySelection();
    }
}