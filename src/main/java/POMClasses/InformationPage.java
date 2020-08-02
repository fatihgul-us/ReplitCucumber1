package POMClasses;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InformationPage extends ParentClass{
WebElement myElement;
    public InformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private  WebElement lastname;

    @FindBy(id = "old_passwd")
    private  WebElement oldPasswd;

    @FindBy(id = "passwd")
    private  WebElement passwd;

    @FindBy(id = "confirmation")
    private  WebElement confirmation;

    @FindBy(css = "button[name='submitIdentity']")
    private WebElement submitIdentity;

    @FindBy (css = "a[class='account']>span")
    private WebElement acoountName;

    @FindBy(xpath = "(//ul[@class='footer_links clearfix'] /li/a)[1]")
    private WebElement backToAccount;


    public void findElementAndSendKeysFunction(String elementName, String Keys) {
        switch (elementName) {
            case "identity":
                myElement = firstname;
                break;
            case "lastname":
                myElement = lastname;
                break;
            case "passwd":
                myElement = passwd;
                break;
            case "old_passwd":
                myElement = oldPasswd;
                break;
            case "confirmation":
                myElement = confirmation;
                break;
        }
        sendKeysFunction(myElement, Keys);
    }

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "submitIdentity":
                myElement = submitIdentity;
                break;
            case "backToAccount":
                myElement = backToAccount;
                break;
        }
        clickFunction(myElement);
    }

    public String findElementAndGetText(String elementName){
        switch (elementName) {
            case "acoountName":
                myElement = acoountName;
                break;
        }
        wait.until(ExpectedConditions.visibilityOf(myElement));
        return myElement.getText();
    }
}
