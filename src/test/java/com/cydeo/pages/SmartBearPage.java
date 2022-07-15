package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "ctl00$MainContent$username")
    public WebElement inputUsername;
    
    @FindBy (name = "ctl00$MainContent$password")
    public WebElement inputPassword;

    @FindBy (name = "ctl00$MainContent$login_button")
    public WebElement loginBtn;

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }

    @FindBy (xpath = "//a[text()='Order']")
    public WebElement orderBtn;

    @FindBy (id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy (xpath = "//input[@value='Visa']")
    public WebElement visa;

    @FindBy (xpath = "//input[@value='MasterCard']")
    public WebElement masterCard;

    @FindBy (xpath = "//input[@value='American Express']")
    public WebElement americanExpress;

    public WebElement selectCardType(String card){
        if(card.equals("Visa")){
            return visa;
        }else if (card.equals("MasterCard")){
            return masterCard;
        }else if(card.equals("American Express")){
            return americanExpress;
        }
        return null;
    }

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy (xpath = "//a[text()='Process']")
    public WebElement processBtn;

    @FindBy (xpath = "//input[@value='Reset']")
    public WebElement resetBtn;

    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    public void checkInTheList(String customerName) {
        WebElement list = Driver.getDriver().findElement(By.xpath("//div[@class='content']//td[text()='" + customerName + "']"));

        Assert.assertEquals(customerName, list.getText());

    }
}
