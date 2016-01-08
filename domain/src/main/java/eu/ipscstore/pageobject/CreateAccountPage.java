package eu.ipscstore.pageobject;

import org.openqa.selenium.By;
import forall.core.BasePage;
import uk.be2co.pageobject.HomePage;


public class CreateAccountPage extends BasePage {

    private By radioButtonUnknown = By.id("id_gender4");
    private By inputFirstName = By.id("customer_firstname");
    private By inputLastName = By.id("customer_lastnam");
    private By inputEmailAddress = By.id("email"); //  Сделать проверку что email уже введен
    private By inputPassword = By.id("passwd");
    private By selectDays = By.id("days");
    private By selectMonths = By.id("months");
    private By selectYears = By.id("years");
    private By checkboxSignUpNewsletter = By.id("newsletter");
    private By checkboxSpesialOffers = By.id("optin");
    private By checkboxIAgree = By.id("customer_privacy");
    private By buttonRegister = By.id("submitAccount");



    //сейчас выбирается только одно згначение
    //По хорошему надо  передрать все и на регренене рандомная быборка
    public  CreateAccountPage setRadioButton() {
        click(radioButtonUnknown);
        return this;
    }

    public CreateAccountPage setFirstName(String FirstName){
        setText(inputFirstName, FirstName);
        return this;
    }

    public CreateAccountPage setLastName(String LastName){
        setText(inputLastName, LastName);
        return this;
    }

    // в тесте должна быть проверка что email уже введен. Пока я просто перепишу
    public CreateAccountPage setEmailAddress(String EmailAddress){
        setText(inputEmailAddress,  EmailAddress);
        return this;
    }

    public CreateAccountPage setPassword(String Password){
        setText(inputPassword, Password);
        return this;
    }

    public  CreateAccountPage selectBirthday(){
        selectFromDropDownList(selectDays);
        return this;
    }

    public  CreateAccountPage selectMonth(){
        selectFromDropDownList(selectMonths);
        return this;
    }

    public  CreateAccountPage selectYear(){
        selectFromDropDownList(selectYears);
        return this;
    }

    public  CreateAccountPage setSignUpNewsletter() {
        click(checkboxSignUpNewsletter);
        return this;
    }

    public  CreateAccountPage setSpesialOffers() {
        click(checkboxSpesialOffers);
        return this;
    }
    //public CreateAccountPage setMonth(){}

    //public CreateAccountPage setYear(){}

    // сейчас не выбираем  newsletter и spesial offers

    //WebElement mySelectElm = driver.findElement(By.id("mySelectID"));
    //Select mySelect= new Select(mySelectElm);
    //selMySelect.selectByValue("Value");

    public  CreateAccountPage setIAgree() {
        click(checkboxIAgree);
        return this;
    }

    //Переписать конечную страницу
    public HomePage clickRegisterButton() {
        click(buttonRegister);
        return new HomePage();
    }

}
