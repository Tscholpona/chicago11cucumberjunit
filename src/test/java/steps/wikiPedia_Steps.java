package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class wikiPedia_Steps {
    WikipediaHomePage wiki = new WikipediaHomePage();

    @Given("User is on wikipedia homepage")
    public void user_is_on_wikipedia_homepage() {
        Driver.getDriver().get(Config.getProperty("wikiURL"));
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String word) {
       wiki.searchBox.sendKeys(word);

    }
    @When("User clicks search button finally")
    public void user_clicks_search_button_finally() {
      wiki.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String word2) {
     String actualTitle = Driver.getDriver().getTitle();
     String expectedTitle = word2+" - Wikipedia";
     Assert.assertTrue("Wiki title is not matching",actualTitle.equalsIgnoreCase(expectedTitle));

    }
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {
        String expectedHeader = mainHeader;
        String actualHeader = wiki.mainHeader.getText();
        Assert.assertEquals(expectedHeader,actualHeader);

    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
     String expectedImageHeader = imageHeader;
     String actualImageHeader = wiki.imageHeader.getText();
     Assert.assertEquals(expectedImageHeader,actualImageHeader);
    }


}
