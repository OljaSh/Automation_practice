package eu.ipscstore.pageobject;

import org.openqa.selenium.By;
import forall.core.BasePage;


public class SiteHomePage extends BasePage {

    private By buttonCreateAnAccount = By.className("header_link_createanaccount");

    public LoginPage clickCreateAnAccountbutton(){
        click(buttonCreateAnAccount);
        return new LoginPage();
    }
}
