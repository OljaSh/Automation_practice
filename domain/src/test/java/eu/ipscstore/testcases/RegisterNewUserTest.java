package eu.ipscstore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import forall.core.BaseTest;
import eu.ipscstore.pageobject.HomePage;


/**
 * Created by olja on 08/01/16.
 */
public class RegisterNewUserTest extends BaseTest{

    // private static final String URL = "http://www.be2.co.uk/";
    private static final String URL = "www.ipscstore.eu";

    private String newUserEmailAddress = "shseven@hotmail.com";
    private String Password = "test1234";

    //private String wrongUserName = "shseven111111222@hotmail.com";
    //private String wrongPassword = "1234tttttt";



    @Test
    public void CreateNewUserTest() {
        loadSiteUlr(URL);
        //Эта строка не понятна
        String userName = new HomePage()

                .c
                .clickButtonCreateAnAccount()
                .setEmailAddress(newUserEmailAddress)
                .clickButtonCreateAnAccount()


                .setPassword(Password)
                .clickLoginButton()
                .getUserName();

        Assert.assertEquals(userName, "You are logged in as Seven");
    }
}
