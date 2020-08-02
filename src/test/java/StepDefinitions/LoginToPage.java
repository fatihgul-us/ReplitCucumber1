package StepDefinitions;

import POMClasses.MainPage;
import Utilities.Driver;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginToPage  {
    WebDriver driver;
    MainPage mainPageElements = new MainPage();

    @Given("^Navigate to web page$")
    public void navigate_to_web_page() {
        driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Then("^Click on sign in menu$")
    public void click_on_sign_in_menu() {
        mainPageElements.findElementAndClickFunction("SigInButton");
    }

    @Then("^Enter email address$")
    public void enter_email_address() {
        mainPageElements.findElementAndSendKeysFunction("email", "atlanta@gmail.com");
    }

    @Then("^Enter Password$")
    public void enter_Password() {
        mainPageElements.findElementAndSendKeysFunction("passWord", "Asdf4321-");
    }

    @Then("^Click on sign in button$")
    public void click_on_sign_in_button() throws InterruptedException {
        mainPageElements.findElementAndClickFunction("SubmitButton");
        Thread.sleep(2000);
    }

}
