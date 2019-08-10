package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class GoogleSteps {
    @When("User is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://google.com");

    }


    @When("User searches for a book")
    public void user_searches_for_a_book() {
        WebElement search = Driver.getDriver().findElement(By.name("q"));
        search.sendKeys("book"+ Keys.ENTER);
    }

    @Then("User should see books inside of the title")
    public void user_should_see_books_inside_of_the_title() {
      String actualTitle = Driver.getDriver().getTitle();
      String expected = "book";
        Assert.assertTrue(actualTitle.contains(expected));
    }

    @When("User searches for a word {string}")
    public void user_searches_for_a_word(String word) {
        WebElement search = Driver.getDriver().findElement(By.name("q"));
        search.sendKeys(word+ Keys.ENTER);
    }

    @Then("User should see  a word {string} inside of the title")
    public void user_should_see_a_word_inside_of_the_title(String word) {

        String actualTitle = Driver.getDriver().getTitle();
        String expected = word;
        Assert.assertTrue(actualTitle.contains(expected));
        Driver.quitDriver();

    }
    @When("User sees google search page")
    public void user_sees_google_search_page() {
       Driver.getDriver().get("http://google.com");

    }

    @Then("User searches for crayons")
    public void user_searches_for_crayons() {
        WebElement search = Driver.getDriver().findElement(By.name("q"));
        search.sendKeys("crayons"+Keys.ENTER);
    }

    @Then("User sees crayons inside of title")
    public void user_sees_crayons_inside_of_title() {
        String expectation = Driver.getDriver().getTitle();
        String actualResult = "crayons";
        Assert.assertTrue(expectation.contains(actualResult));
    }
    @Then("User should see a new word {string} inside of the title")
    public void user_should_see_a_new_word_inside_of_the_title(String word) {
        String expectation = Driver.getDriver().getTitle();
        String actualResult = word;
        Assert.assertTrue(expectation.contains(actualResult));
        Driver.quitDriver();
    }
    @Given("User tests with words {string} {string} {string}")
    public void user_tests_with_words(String word1, String word2, String word3) {

    }

    @Then("User checks numbers {int} and {int}")
    public void user_checks_numbers_and(Integer num1, Integer num2) {

    }
    @When("User is on Amazon application")
    public void user_is_on_Amazon_application() {

    }

    @Then("User should see Amazon in title")
    public void user_should_see_Amazon_in_title() {

    }

    @Then("User searches for a bag")
    public void user_searches_for_a_bag() {

    }









}
