package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.EtsyPracticeHomepage;
import utilities.Config;
import utilities.Driver;

public class etsyPractice_Steps {
    EtsyPracticeHomepage practice =  new EtsyPracticeHomepage();
    @Given("User is on Etsy website page")
    public void user_is_on_Etsy_website_page() {
        Driver.getDriver().get(Config.getProperty("etsyNew"));
    }
    @When("User types {string} in search box")
    public void user_types_in_search_box(String word1) {
        practice.searchBox.sendKeys(word1);
    }
    @When("User clicks on the search button")
    public void user_clicks_on_the_search_button() {
      practice.searchKnopka.click();
    }

    @Then("User sees {string} in the title")
    public void user_sees_in_the_title(String word2) {
      String actualTitle = Driver.getDriver().getTitle();
      String expcetedTitle = word2+ " | Etsy";
      Assert.assertTrue(actualTitle.equalsIgnoreCase(expcetedTitle));
    }
}
