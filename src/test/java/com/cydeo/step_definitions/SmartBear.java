package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class SmartBear {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page(Map<String, String> loginCredentials) {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");  // or you can use from configuration properties.

        smartBearPage.login("Tester", "test");

        smartBearPage.orderBtn.click();
    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        smartBearPage.orderBtn.click();
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String product) {
        Select productDD = new Select(smartBearPage.product);
        productDD.selectByVisibleText(product);
    }
    @Then("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer quantity) {
       smartBearPage.quantity.sendKeys(String.valueOf(quantity));
    }
    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartBearPage.customerName.sendKeys(customerName);
    }
    @Then("User enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBearPage.street.sendKeys(street);
    }
    @Then("User enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBearPage.city.sendKeys(city);
    }
    @Then("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearPage.state.sendKeys(state);
    }
    @Then("User enters {int}")
    public void user_enters(Integer zipCode) {
        smartBearPage.zipCode.sendKeys(String.valueOf(zipCode));
    }
    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String card) {
        smartBearPage.selectCardType(card).click();

    }
    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        smartBearPage.cardNumber.sendKeys(String.valueOf(cardNumber));
    }
    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expireDate) {
        smartBearPage.expireDate.sendKeys(expireDate);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
       smartBearPage.processBtn.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String customerName) {
        smartBearPage.viewAllOrders.click();

        smartBearPage.checkInTheList(customerName);

    }

}
