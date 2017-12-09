package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Random;

public class GmailMainPage {
    WebDriver driver;

    @FindBy (how = How.CSS, css = ".T-I-KE[role='button']")
    WebElement sendButton;

    @FindBy (how = How.CSS, css = "[name='to']")
    WebElement recipientEmail;

    @FindBy (how = How.CSS, css = "[name='subjectbox']")
    WebElement subjectBox;

    @FindBy (how = How.CSS, css = "[role='textbox']")
    WebElement bodyBox;

    @FindBy (how = How.CSS, css = "[tabindex='1'][role='button'][data-tooltip-delay='800']")
    WebElement sendMessageButton;

    @FindBy (how = How.CSS, css = "div[role='checkbox']")
    WebElement firstCheckBox;

    @FindBy (how = How.CSS, css = "[role='button'][act='10']")
    WebElement deleteButton;

    @FindBy (how = How.CSS, css = "[tabindex='0'][role='button'][act='20']")
    WebElement refreshButton;

    @FindBy (how = How.CSS, css = "[href='https://mail.google.com/mail/#inbox']")
    WebElement inboxLink;

    public WebElement getInboxLink() {
        return inboxLink;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public WebElement getFirstCheckBox() {
        return firstCheckBox;
    }

    public GmailMainPage (WebDriver driver) {this.driver = driver;}

    public void clickOnSendButton () {
        sendButton.click();
    }

    public void setRecipientEmail(String email) {
        recipientEmail.sendKeys(email);
    }

    public void setSubject (){
        subjectBox.sendKeys(RandomStringUtils.randomAlphabetic(10));
    }

    public void setBody() {
        bodyBox.sendKeys(RandomStringUtils.randomAlphabetic(10));
    }

    public void clickSendMessageButton () {
        sendMessageButton.click();
    }

    public void selectCheckBox () {
        firstCheckBox.click();
    }

    public void clickDeleteButton () {
        deleteButton.click();
    }

    public void clickRefreshButton (){
        refreshButton.click();
    }
}
