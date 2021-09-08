package pages;

import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends PageObject{

    private final static By HOMEANDFLATES = By.xpath("//span[@class=\"b-main-navigation__text\" and contains(text(),'Дома и квартиры')]");
    private final static By AVTOBARAHOLKA = By.xpath("//span[@class=\"b-main-navigation__text\" and contains(text(),'Автобарахолка')]");


    public MainPage hoverHomeAndFlates(WebDriver driver){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(HOMEANDFLATES)).build().perform();
        return this;
    }



    public MainPage hoverAvtobaraholca(WebDriver driver){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(AVTOBARAHOLKA)).build().perform();
        return this;
    }

}
