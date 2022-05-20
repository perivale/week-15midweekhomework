package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "(xpath = \"//div[@class=\\\"search-header__left\\\"]/child::h1\")")
   WebElement resultText;



    public String verifyTheResults(String result){
      return getTextFromElement(resultText,result);
    }








}
