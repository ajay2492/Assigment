package comm.elementlocator;

public class ConstantXpath {
/* Home page xpath's */

    /*public static final String HOME_PAGE_SEARCH_BOX = "//div[@class='_12nbOYJX']" +
        "//following-sibling::div//form//input[@class='_3qLQ-U8m']";*/

    public static final String HOME_PAGE_SEARCH_BOX = "//input[@placeholder='Where to?']";
    public static final String DES_FROM_SUGG = "//div//a[@class='_1aRPCGmR'][";

/* Hotel Details Xpath's */

    public static final String HOTEL_HEADER = "//h1[@id='HEADING']";
   // public static final String WRITE_REVIEW = "//div[@id='taplc_masthead_h1_hr_resp_0']//h1";
    public static final String MORE_QUESTION_DIV = "//div[@id='COVID19']";
    public static final String WRITE_REVIEW ="//div[text()='Community']//parent::div//a[text()='Write a review']";

/* Write a review screen xpath */

    public static final String BUBBLE_RATING = "//span[@id='bubble_rating']";
    public static final String REVIEW_TITLE = "//input[@id='ReviewTitle']";
    public static final String REVIEW_TEXT = "//textarea[@id='ReviewText']";
    public static final String HOTEL_RATING = "//div[@id='DQ_RATINGS']";
    public static final String HOTEL_SERVICE = "//div[text()='Service']";
    public static final String HOTEL_SLEEP_QUALITY ="//div[text()='Sleep Quality']";
    public static final String HOTEL_ROOMS = "//div[text()='Rooms']";
    public static final String HOTEL_CLEANLINESS = "//div[text()='Cleanliness']";
    public static final String HOTEL_LOCATION = "//div[text()='Location']";
    public static final String QUESTIONS_LIST = "//div[@class='detailsQuestion question']";
    public static final String SUBMIT_REVIEW_CHECK_BOX="//input[@id='noFraud']";
}
