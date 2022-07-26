package pages.localHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LocalHookupPage extends BasePage {

    public LocalHookupPage (WebDriver driver) {super(driver);}

    private final By learnMoreButton = By.xpath("//a[@class='rqzvMi5z4kz oXrwcE9Q-K1A']");
    private final By loadMoreButton = By.xpath("//button[@class='kGEwpGjLK Esg_Ghr js-showner-more js-showner-sortgroups']");
    private final By cityBlock = By.xpath("//div[normalize-space()='Chicago']");
    private final By loadMoreReviewButton = By.xpath("//button[@class='kGEwpGjLK Esg_Ghr kWzsQJ3O5Va js-showner-more']");
    private final By reviewBlock = By.xpath("(//tr[@class='Nr7cc5cVvT'])[2]");
    private final By faqCollapseButton = By.xpath("(//div[@class='sBFf5'])[1]");
    private final By faqCollapseText = By.xpath("(//div[@class='eEADAPu'])[1]");
    private final By nextSliderButton = By.xpath("//button[@class='js-sites-next-sm slick-next slick-arrow']");
    private final By blogSlide = By.xpath("(//div[@class='C8EJ4K0y-wPR'])[6]");
    private final By scrollToBlogSlider = By.xpath("(//h2[@class='Mb9Bp63q'])[16]");
    private final By authorButton = By.xpath("//a[@class='gfvi-LyUDz']");

    public LocalHookupPage learnMoreButtonClick () {
        driver.findElement(learnMoreButton).click();
        return this;
    }

    public LocalHookupPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean cityBlockCheck () {
        return elementVisibleCheck(cityBlock);
    }

    public LocalHookupPage visitSiteButtonClick (int numButton) {
        By visitSiteButton = By.xpath("(//a[@class[contains(.,'rqzvMi5z4kz aYUeSv3G')]])[" + numButton + "]");
        driver.findElement(visitSiteButton).click();
        return this;
    }

    public LocalHookupPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class[contains(.,'zk8Edh2')]])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public LocalHookupPage latestNewsButtonClick (int numButton) {
        By latestNewsButton = By.xpath("(//a[@class='rWDFkn'])[" + numButton + "]");
        driver.findElement(latestNewsButton).click();
        return this;
    }

    public LocalHookupPage loadMoreReviewButtonClick () {
        driver.findElement(loadMoreReviewButton).click();
        return this;
    }

    public Boolean reviewBlockCheck () {
        return elementVisibleCheck(reviewBlock);
    }

    public LocalHookupPage visitSiteInTextButtonClick (int numButton) {
        By visitSiteInTextButton = By.xpath("(//a[@class='rqzvMi5z4kz wsf2Xf DV7UJB3XQm5'])[" + numButton + "]");
        driver.findElement(visitSiteInTextButton).click();
        return this;
    }

    public LocalHookupPage readFullReviewButtonClick (int numButton) {
        By readFullReviewButton = By.xpath("(//a[@class='vd_-IJLN_qH'])[" + numButton + "]");
        driver.findElement(readFullReviewButton).click();
        return this;
    }

    public LocalHookupPage faqCollapseButtonClick () {
        driver.findElement(faqCollapseButton).click();
        return this;
    }

    public Boolean faqCollapseTextCheck () {
        return elementVisibleCheck(faqCollapseText);
    }

    public LocalHookupPage articlesButtonClick (int numButton) {
        By articlesButton = By.xpath("(//a[@class='uGE-l'])[" + numButton + "]");
        driver.findElement(articlesButton).click();
        return this;
    }

    public LocalHookupPage scrollToBlogSlider () {
        scrollToElement(scrollToBlogSlider);
        return this;
    }

    public LocalHookupPage nextBlogSliderButtonClick () {
        driver.findElement(nextSliderButton).click();
        return this;
    }

    public Boolean blogSliderVisibleCheck () {
        return elementVisibleCheck(blogSlide);
    }

    public LocalHookupPage authorButtonClick () {
        driver.findElement(authorButton).click();
        return this;
    }

    public Boolean authorUrlCheck () {
        return driver.getTitle().contains("Caitlyn");
    }

}
