package com.zestmoney.assigment3;

import comm.framework.TestBaseTest;
import comm.pageobject.zestmoney.assigment3.HotelPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelTest extends TestBaseTest {

    public static HotelPage hotelPage;

    @BeforeTest
    public void initialSetpUp() {
        initialSetup();
        hotelPage = new HotelPage(getdriver());
        hotelPage.moveToHotelPage();
    }

    /*  @AfterClass
       public static void closeAfterTest(){
          if(driver != null){
              Logger.info("Closing the WebDriver");
              driver.close();
              driver.quit();
          }
      }*/
    @Test
    public static void verifyWriteReview() {
        hotelPage.verifyWriteReview();
    }
}
