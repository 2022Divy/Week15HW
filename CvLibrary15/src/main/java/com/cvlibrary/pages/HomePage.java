package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    //By JobTitle = By.xpath("//input[@id='keywords']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement JobTitle;
    //By Location = By.xpath("//input[@id='location']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    //By moreSearch = By.xpath("//button[@id='toggle-hp-search']");
    @CacheLookup
    @FindBy(xpath = "//div[@class='hp-search-more']/button")
    WebElement moreSearch;
    //WebDriver driver;


    //By salaryMin = By.xpath("//input[@name='salarymin']");
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-min']/input")
    WebElement salaryMin;
    //By salaryMax = By.xpath("//input[@name='salarymax']");
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-max']/input")
    WebElement salaryMax;

    //By findJobbtn = By.id("hp-search-btn");
    @CacheLookup
    @FindBy(xpath = "//div[@class='home-search hps-transition advanced']/div[4]/input")
    WebElement findJobbtn;

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(JobTitle, jobTitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(Location, location);
    }

    public void selectDistance(String distance) {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='distance']"));

        Select select = new Select(dropDown);
        select.selectByVisibleText(distance);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearch);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String Type) {
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='salarytype']"));
        Select select = new Select(dropDown1);
        select.selectByVisibleText(Type);
    }

    public void selectJobType(String jobType) {
        WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='tempperm']"));
        Select select = new Select(dropDown2);
        select.selectByVisibleText(jobType);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobbtn);
    }

    /*public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }*/

    /*public void verifyJobSearchResult() {


        enterJobTitle("Tester");
        enterLocation("Harrow");
        selectDistance("5 miles");
        clickOnMoreSearchOptionLink();
        enterMinSalary("30000");
        enterMaxSalary("500000");
        selectSalaryType("Per annum");
        selectJobType("Permanent");
        clickOnFindJobsButton();
    }*/


}
