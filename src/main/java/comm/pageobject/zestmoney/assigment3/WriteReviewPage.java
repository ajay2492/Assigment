package comm.pageobject.zestmoney.assigment3;

import comm.elementlocator.ConstantXpath;
import comm.framework.Constants;
import comm.framework.Logger;
import comm.framework.Message;
import comm.framework.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class WriteReviewPage extends TestBasePage {

    private static WebDriver driver;

    public WriteReviewPage(WebDriver inputDriver) {
        this.driver = inputDriver;
    }

    protected static WebElement getFirstBubbleRating() {
        return findByXpath(ConstantXpath.BUBBLE_RATING);
    }

    protected static WebElement getReviewTitle() {
        return findByXpath(ConstantXpath.REVIEW_TITLE);
    }

    protected static WebElement getReviewTextArea() {
        return findByXpath(ConstantXpath.REVIEW_TEXT);
    }

    protected static WebElement getHotelRating() {
        return findByXpath(ConstantXpath.HOTEL_RATING);
    }

    protected static List<WebElement> getQuestionsList() {
        return findListByXpath(ConstantXpath.QUESTIONS_LIST);
    }

    protected static WebElement getSubmitCheckBox() {
        return findByXpath(ConstantXpath.SUBMIT_REVIEW_CHECK_BOX);
    }

    public void moveToWriteReviewPage() {
        HotelPage hotelPage = new HotelPage(driver);
        hotelPage.moveToHotelPage();
        hotelPage.verifyWriteReview();

    }

    public void verifyBubbleRating() {
        selectBubbleRating(ConstantXpath.BUBBLE_RATING, 5);
    }

    public void verifyReviewTitleTextArea() {
        Assert.assertTrue(getReviewTitle().isDisplayed());
        getReviewTitle().sendKeys(Constants.REVIEW_TITLE);
        Assert.assertTrue(getReviewTextArea().isDisplayed());
        getReviewTextArea().sendKeys(Constants.REVIEW_TEXT_AREA);
    }

    public void verifyHotelRating() {
        verticalScrollByElement(getHotelRating());
        if (getHotelRating().isDisplayed()) {
            for (WebElement inputElement : getQuestionsList()) {
                if (inputElement.isDisplayed()) {
                    selectBubbleRating(getHotelServiceBubbleRatingXpath(inputElement.getText()), 5);
                } else {
                    Logger.info(Message.ELEMENT_INFO_1
                            + inputElement.getAttribute("innerText")
                            + Message.ELEMENT_INFO_2);
                }
            }
        }
    }

    public void verifySubmitCheckBox() {
        verticalScrollTillEnd();
        if (!getSubmitCheckBox().isSelected()) {
            getSubmitCheckBox().click();
        } else {
            Assert.fail(Message.SUBMIT_CHECK_BOX);
        }
    }
}
