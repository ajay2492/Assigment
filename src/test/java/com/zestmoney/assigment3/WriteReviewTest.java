package com.zestmoney.assigment3;

import comm.framework.Logger;
import comm.framework.TestBaseTest;
import comm.pageobject.zestmoney.assigment3.WriteReviewPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteReviewTest extends TestBaseTest {

    public static WriteReviewPage writeReviewPage;

    @BeforeTest
    public static void initialSetpUp() {
        initialSetup();
        writeReviewPage = new WriteReviewPage(getdriver());
        writeReviewPage.moveToWriteReviewPage();
    }

    @AfterClass
    public static void closeAfterTest() {
        if (driver != null) {
            Logger.info("Closing the WebDriver");
            driver.close();
            driver.quit();
        }
    }
        @Test(priority = 1)
        public void verifyBubbleRating () {
            writeReviewPage.verifyBubbleRating();
        }

        @Test(priority = 2)
        public void verifyReviewTitleTextArea () {
            writeReviewPage.verifyReviewTitleTextArea();
        }

        @Test(priority = 3)
        public void verifyHotelRating () {
            writeReviewPage.verifyHotelRating();
        }

        @Test(priority = 4)
        public void verifySubmitCheckBox () {
            writeReviewPage.verifySubmitCheckBox();
        }
}

