package StepDefinitions;

import POMClasses.InformationPage;
import POMClasses.MainPage;
import Utilities.Driver;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChangeName extends Driver {
    String name;
    WebDriverWait wait;
    WebDriver driver;
    MainPage mainPageElements = new MainPage();
    InformationPage informationPage = new InformationPage();

    @When("^Click on the My personal information$")
    public void click_on_the_My_personal_information() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        mainPageElements.findElementAndClickFunction("information");
    }

    @Then("^Change the first name as \"([^\"]*)\"$")
    public void change_the_first_name_as(String name) {
        this.name = name;
        informationPage.findElementAndSendKeysFunction("identity", this.name);
    }

    @Then("^Enter the currentPassword$")
    public void enter_the_currentPassword() {
        informationPage.findElementAndSendKeysFunction("old_passwd", "Asdf4321-");
    }

    @Then("^Enter the new password$")
    public void enter_the_new_password() {
        informationPage.findElementAndSendKeysFunction("passwd", "Asdf4321-");
    }

    @Then("^Enter the Confirmation$")
    public void enter_the_Confirmation() {
        informationPage.findElementAndSendKeysFunction("confirmation", "Asdf4321-");
    }

    @Then("^Click on the save button$")
    public void click_on_the_save_button() {
        informationPage.findElementAndClickFunction("submitIdentity");
    }

    @Then("^Verify the name on the top right is updated as your first name$")
    public void verify_the_name_on_the_top_right_is_updated_as_your_first_name() {

        Assert.assertEquals(name + " Gul", informationPage.findElementAndGetText("acoountName"));
    }


    @Given("^Click on Back To Account button$")
    public void click_on_back_to_account_button() {
        informationPage.findElementAndClickFunction("backToAccount");

    }

}
