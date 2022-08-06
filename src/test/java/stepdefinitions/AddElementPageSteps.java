package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AddRemoveElementsPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class AddElementPageSteps {
    WebDriver driver = DriverHelper.getDriver();
    AddRemoveElementsPage addRemovePage = new AddRemoveElementsPage(driver);

    @Given("the user navigates to The Internet \\(the-internet.herokuapp.com)")
    public void the_user_navigates_to_the_internet_the_internet_herokuapp_com() {
        driver.navigate().to(ConfigReader.readProperty("herokuappurl"));

    }
    @When("user adds {string} elements")
    public void user_adds_elements(String elements) {
        addRemovePage.addElements(elements);

    }
    @Then("asserts that {string} elements exist on the page")
    public void asserts_that_elements_exist_on_the_page(String numberOfElements) {
        Assert.assertEquals(addRemovePage.listSize(),numberOfElements);
    }
}
