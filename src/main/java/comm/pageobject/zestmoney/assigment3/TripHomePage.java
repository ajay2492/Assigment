package comm.pageobject.zestmoney.assigment3;

import comm.elementlocator.ConstantXpath;
import comm.framework.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class TripHomePage extends TestBasePage {

    public static WebDriver driver;

    public static final String LOCATION_TO_SEARCH = "Club Mahindra";

   public TripHomePage(WebDriver driver) {
        this.driver = driver;
    }

    protected static WebElement getSearchBox(){
       return findByXpath(ConstantXpath.HOME_PAGE_SEARCH_BOX);
    }
    protected static WebElement getDesFromSuggestion(String elementNumberToSelect){
        return findByXpath(ConstantXpath.DES_FROM_SUGG+elementNumberToSelect+"]");
    }

    public void verifyLaunchHomePage() {
        Assert.assertTrue(getSearchBox().isDisplayed());
        getSearchBox().sendKeys(LOCATION_TO_SEARCH);
    }

   public void verifySelection() {
       staticWait(Constants.STATIC_WAIT_4);
       getDesFromSuggestion("1").click();
       staticWait(Constants.STATIC_WAIT_2);
       Assert.assertTrue(HotelPage.getHotelHeader().getText().contains(LOCATION_TO_SEARCH));
       findByXpath("//div[@class='_3EhPLbeL']/div").click();
   }

}
