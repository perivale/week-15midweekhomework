package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

import java.nio.file.Watchable;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Accept All')]")
    WebElement accpetcookies;

    @FindBy(id = "keywords")
    WebElement jobtitle;


    @FindBy(id = "location")
    WebElement location;

    @FindBy(id = "distance")
    WebElement distance1;

  @FindBy(id="toggle-hp-search")
  WebElement morejoboprion;

    @FindBy(id = "salarymin")
    WebElement salarymin;

    @FindBy(id = "salarymax")
    WebElement salarymax;

    @FindBy(id = "salarytype")
    WebElement salarytype;

    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @FindBy(xpath = "//span[contains(text(),'Accept All')]")
    WebElement cookiesAcceptField;


    public void clickonjobtitle(String title) {
        sendTextToElement(jobtitle, title);
    }

    public void sendtextonlocation(String location1) {
        sendTextToElement(location, location1);
    }

    public void eneterdistance(String distance) {
        selectByVisibleTextFromDropDown(distance1, distance);
    }

    public void clickonmoreoprinon() {
        clickOnElement(morejoboprion);
    }

    public void enterminmunsalary(String salary) {
        sendTextToElement(salarymin, salary);
    }

    public void entermaximunsalary(String salary1) {
        sendTextToElement(salarymax, salary1);
    }

    public void salarytype(String stype) {
        selectByVisibleTextFromDropDown(salarytype, stype);
    }

    public void selectJobType(String jobType) {
        selectByValueFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }

    public void hanldingIframe() {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(cookiesAcceptField);
        driver.switchTo().defaultContent();
    }
}