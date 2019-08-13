package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyPracticeHomepage {
     public EtsyPracticeHomepage(){
         PageFactory.initElements(Driver.getDriver(),this);

     }
    @FindBy(id="search-query")
    public WebElement searchBox;
     @FindBy(xpath ="//button[@value='Search']")
    public WebElement searchKnopka;
//
}
