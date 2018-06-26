package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends MainPage{

    @FindBy (css = "input[placeholder='First Name']") private WebElement firstNameInput;
    @FindBy (css = "input[placeholder='Last Name']") private WebElement lastNameInput;
    @FindBy (css = "input[placeholder='Mobile Number']") private WebElement mobileNumberInput;
    @FindBy (css = "input[placeholder='Email']") private WebElement emailInput;
    @FindBy (css = "input[placeholder='Password']") private WebElement passwordInput;
    @FindBy (css = "input[placeholder='Confirm Password']") private WebElement confirmPasswordInput;
    @FindBy (xpath = "//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']") private WebElement signUpButton;


    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SignInPage sendName(String name){
        firstNameInput.sendKeys(name);
        return this;
    }

    public SignInPage sendLastName(String name){
        lastNameInput.sendKeys(name);
        return this;
    }

    public SignInPage sendMobileNumber(String number){
        mobileNumberInput.sendKeys(number);
        return this;
    }

    public SignInPage sendEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }

    public SignInPage sendPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public SignInPage sendPasswordConformation(String password){
        confirmPasswordInput.sendKeys(password);
        return this;
    }

    public SignInPage signUp(){
        signUpButton.click();
        return this;
    }






}
