package pages.escort;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class EscortPage extends BasePage {

    public EscortPage (WebDriver driver) {super(driver);}

    private final By cityButton = By.xpath("(//a[@class='gWCcqpk '])[4]");
    private final By inputCitySearch = By.xpath("//input[@class='Tm_2vEy ByU32q']");
    private final By searchButton = By.xpath("//button[@class='rqzvMi5z4kz pmYCD9i js-escorts-search-submit']");

    public EscortPage cityButtonClick () {
        driver.findElement(cityButton).click();
        return this;
    }

    public Boolean cityButtonCheck () {
        boolean result = false;
        if (driver.getCurrentUrl().contains("https://datingmentor.org/escort/montgomery/")) {
            result = true;
        }
        return result;
    }

    public EscortPage enterCity () {
        driver.findElement(inputCitySearch).sendKeys("Montgomery");
        return this;
    }

    public EscortPage searchButtonClick () {
        driver.findElement(searchButton).click();
        return this;
    }

}
