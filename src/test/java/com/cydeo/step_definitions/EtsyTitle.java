package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class EtsyTitle {
    EtsyPage etsyPage = new EtsyPage(); // creating object of EtsyPage
    String title1 = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

    @Given("User is on the Etsy page")
    public void user_is_on_the_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com/");


    }
    @Given("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        Assert.assertEquals(this.title1, Driver.getDriver().getTitle());

    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchbox.sendKeys("Wooden Spoon");
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchBtn.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String item) {
        etsyPage.searchbox.sendKeys(item);

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String title) {
        String expected = title + " - Etsy";
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(expected, actual);
    }

}
