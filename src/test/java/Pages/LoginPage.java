package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;
    @FindBy (how= How.CSS, css = "#identifierId")
    WebElement emailField;

    @FindBy (how = How.CSS, css = "#identifierNext")
    WebElement nextButton;

    public LoginPage (WebDriver driver) {this.driver = driver;}

    public void setEmail (String email){
        emailField.sendKeys(email);
    }

    public void clickNextButton () {
        nextButton.click();
    }
}
