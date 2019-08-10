package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomepagePractice;
import utilities.Driver;

public class wikipedaPractice_Steps {
    WikipediaHomepagePractice ss = new WikipediaHomepagePractice();
    @Given("I am in the website page")
    public void i_am_in_the_website_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }

    @When("I type {string} in the search page")
    public void i_type_in_the_search_page(String word1) {
        ss.searchBox.sendKeys(word1);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
    ss.searchButton.click();
    }

    @Then("I see {string} in the main header;")
    public void i_see_in_the_main_header(String word2) {
     String actualmainHeader = Driver.getDriver().getTitle();
     String expectedMainheader = word2 + ss.mainHeader;
     Assert.assertTrue(actualmainHeader.contains(expectedMainheader));

    }

    @Then("I see {string} in the image header")
    public void i_see_in_the_image_header(String word3) {
       String actualImageHeader = Driver.getDriver().getTitle();
       String expectedImageHeader = word3 + ss.imageHeader;
       Assert.assertTrue(actualImageHeader.equalsIgnoreCase(expectedImageHeader));

    }

}
