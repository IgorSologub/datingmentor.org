package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    private final By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[1]");
    private final By learnMoreRegButton = By.xpath("//a[contains(@class,'rqzvMi5z4kz oXrwcE9Q-K1A')]");

    public MainPage changeLanguageButtonClick (int numButton) {
        By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[" + numButton + "]");
        driver.findElement(changeLanguageButton).click();
        return this;
    }

    public MainPage learnMoreRegButtonClick () {
        driver.findElement(learnMoreRegButton).click();
        return this;
    }

    public MainPage visitSiteRegButtonClick(int numButton) {
        By visitSiteRegButton = By.xpath("(//a[contains(@class,'rqzvMi5z4kz sHn45gOhv')])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public MainPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='fc2LB'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public MainPage visitSiteInTextRegButtonClick(int numButton) {
        By visitSiteInTextRegButton = By.xpath("(//a[contains(@class,'rqzvMi5z4kz wsf2Xf DV7UJB3XQm5')])[" + numButton + "]");
        driver.findElement(visitSiteInTextRegButton).click();
        return this;
    }

    public MainPage readFullReviewButtonClick (int numButton) {
        By readFullReviewButton = By.xpath("(//a[@class='vd_-IJLN_qH'])[" + numButton + "]");
        driver.findElement(readFullReviewButton).click();
        return this;
    }

    public MainPage bestReviewButtonClick (int numButton) {
        By bestReviewButton = By.xpath("(//a[@class='Eor9yZ'])[" + numButton + "]");
        driver.findElement(bestReviewButton).click();
        return this;
    }

}
