package POMClasses;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends ParentClass {

    public MainPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement passWord;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(css = "a[title='Information']>span")
    private WebElement information;


    WebElement myElement;
    WebDriverWait wait;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "SigInButton":
                myElement = signInButton;
                break;
            case "SubmitButton":
                myElement =submitButton;
                break;
            case "information":
                myElement =information;
                break;
//            case "Nationalities":
//                myElement =Nationalities;
//                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String Keys) {
        switch (elementName) {
            case "email":
                myElement = email;
                break;
            case "passWord":
                myElement = passWord;
                break;
        }
        sendKeysFunction(myElement,Keys);
    }


}
