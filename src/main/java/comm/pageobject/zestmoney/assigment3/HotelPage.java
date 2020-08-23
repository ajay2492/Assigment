package comm.pageobject.zestmoney.assigment3;

import comm.elementlocator.ConstantXpath;
import comm.framework.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HotelPage extends TestBasePage {

    public static WebDriver driver;

    public HotelPage(WebDriver driver) {
        this.driver = driver;

    }

    protected static WebElement getHotelHeader() {
        return findByXpath(ConstantXpath.HOTEL_HEADER);
    }

    protected static WebElement getMoreQuestionDiv() {
        return findByXpath(ConstantXpath.MORE_QUESTION_DIV);
    }

    protected static WebElement getWriteReview() {
        return findByXpath(ConstantXpath.WRITE_REVIEW);
    }

    public void moveToHotelPage() {
        TripHomePage tripHomePage = new TripHomePage(driver);
        tripHomePage.verifyLaunchHomePage();
        tripHomePage.verifySelection();
    }

    public void verifyWriteReview() {
        verticalScrollByElement(getMoreQuestionDiv());
        // verticalScrollByPixel("1000");
        Assert.assertTrue(getWriteReview().isDisplayed());
        getWriteReview().click();
    }


    public static void trial() {
        verticalScrollByElement(getMoreQuestionDiv());
        // verticalScrollByPixel("1000");
        Assert.assertTrue(getWriteReview().isDisplayed());
        getWriteReview().click();
    }
}