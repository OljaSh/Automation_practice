package uk.be2co.core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(){
        driver = BaseTest.getDriver();
    }

    public WebElement findElement(By element){
        return driver.findElement(element);
    }

    public void setText(By element, String text){
        findElement(element).sendKeys(text);
    }

    public void click(By element){
        findElement(element).click();
    }

    public String getText(By element){
        return findElement(element).getText();
    }
}
