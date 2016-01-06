package uk.be2co.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.be2co.core.BaseTest;
import uk.be2co.pageobject.LoginPage;


/**
 * Created by olja on 06/01/16.
 */
public class LoginPageTest extends BaseTest {

   // private static final String URL = "http://www.be2.co.uk/";
    private static final String URLLogin = "http://app.be2.co.uk/login/auth";

    private String UserName = "shseven@hotmail.com";
    private String Password = "test1234";

    private String wrongUserName = "shseven111111222@hotmail.com";
    private String wrongPassword = "1234tttttt";



    @Test
    public void СorrectUserNameLoginPage() {
        loadSiteUlr(URLLogin);
        String userName = new LoginPage()
                .setUserName(UserName)
                .setPassword(Password)
                .clickLoginButton()
                .getUserName();

        Assert.assertEquals(userName, "You are logged in as Seven");
    }


    //    .clickLoginButton() возвращает новый page,  в случае негативного сценария page не возвращается. Как нам переделать с clickLoginButton метод  ?
    //    сейчас я создала новый .clickLoginButtonNegative() метод который возвращает новую ErrorLoginPage  страницу
    @Test
    public void IncorrectUserNameLoginPage(){
        loadSiteUlr(URLLogin);
        String errorMessageText = new LoginPage()
                .setUserName(wrongUserName)
                .setPassword(Password)
                .clickLoginButtonNegative()
                .getErrorMessage();

        Assert.assertEquals(errorMessageText, "Email address and password do not match");
    }

    @Test
    public void IncorrectPasswordLoginPage(){
        loadSiteUlr(URLLogin);
        String errorMessageText = new LoginPage()
                .setUserName(wrongUserName)
                .setPassword(Password)
                .clickLoginButtonNegative()
                .getErrorMessage();

        Assert.assertEquals(errorMessageText, "Email address and password do not match");
    }

}
