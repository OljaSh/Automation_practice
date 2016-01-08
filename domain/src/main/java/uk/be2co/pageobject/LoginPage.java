package uk.be2co.pageobject;

import org.openqa.selenium.By;
import forall.core.BasePage;

/**
 * Created by olja on 06/01/16.
 */
public class LoginPage  extends BasePage{

    private By inputUserName = By.id("username");
    private By inputPassword = By.id("password");
    private By buttonLogin = By.id("login_button");


    public LoginPage setUserName(String userName){
        setText(inputUserName, userName);
        return this;
    }

    public  LoginPage setPassword(String password){
        setText(inputPassword, password);
        return this;
    }

    public HomePage clickLoginButton(){
        click(buttonLogin);
        return new HomePage();
    }



    public ErrorLoginPage clickLoginButtonNegative() {
        click(buttonLogin);
        return new ErrorLoginPage();
    }
}

