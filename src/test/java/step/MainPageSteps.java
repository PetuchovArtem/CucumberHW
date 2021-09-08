package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.model.DataTable;
import org.jruby.ext.ffi.DataConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainPageSteps {


    public WebDriver driver = new ChromeDriver();
    public MainPage mainPage = new MainPage();

    @When("user open onliner site")
    public void openOnlinerSite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

    }

    @And("user hover over on houses and flates")
    public void overHousesAndFlates() {
    mainPage.hoverHomeAndFlates(driver);
    }

    @And("user hover over on avtobaraholka")
    public void overAvtobaraholca() {
        mainPage.hoverAvtobaraholca(driver);

    }

    @Then("avtobaraholka drop down menu is opened with with categories")
    public void findAvtobaraholkaElements(List<String> arg) {
        List<WebElement> elementName =  driver.findElements(By.xpath("//span[@class=\"b-main-navigation__dropdown-advert-sign\"]"));
        List<String> a = new ArrayList<>();

        for (int i = 0; i<elementName.size(); i++){
            a.add(elementName.get(i).getText());
            System.out.println(elementName.get(i).getText());
        }
        for (int count = 0; count<arg.size(); count++){
            Assertions.assertTrue(a.contains(arg.get(count)));
        }
        driver.quit();
    }

    @Then("flates drop down menu is opened with with categories")
    public void findflatsElements(List<String> arg){
        List<WebElement> elementName =  driver.findElements(By.xpath("//span[@class=\"b-main-navigation__dropdown-advert-sign\"]"));
        List<String> a = new ArrayList<>();

        for (int i = 0; i<elementName.size(); i++){
            a.add(elementName.get(i).getText());
            System.out.println(elementName.get(i).getText());
        }
        for (int count = 0; count<arg.size(); count++){
            Assertions.assertTrue(a.contains(arg.get(count)));
        }
        driver.quit();
    }
}
