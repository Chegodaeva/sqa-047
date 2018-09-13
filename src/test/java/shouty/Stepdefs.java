package shouty;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


import java.util.concurrent.TimeUnit;

public class Stepdefs {

    WebDriver driver;

    @Given("I open login page")
    public void iOpenLoginPage() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://shipovalov.net/login_page.php");

    }

    @When("I fill login form")
    public void iFillLoginForm(){
        driver.findElement(By.cssSelector("form[name='login_form']"))
                .findElement(By.cssSelector("input[name='username']")).clear();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("student");


        driver.findElement(By.cssSelector("input[name='password']")).clear();
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("luxoft");


        driver.findElement(By.cssSelector("input.button")).click();
        WebDriverWait wait =new WebDriverWait(driver, 5, 1000);

        wait.until(elementToBeClickable(By.linkText("Logout")));







    }

    @Then("Logout link is visible")
    public void logoutLinkIsVisible() {
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }

    @Then("Select Project is visible")
    public void selectProjectIsVisible() throws InterruptedException {
        Select selectProject = new Select(driver.findElement(By.cssSelector("select[name='project_id']")));
        selectProject.selectByVisibleText("11122");
        Thread.sleep(5000);

        //Пример работы с Actions
        new Actions(driver)
                .moveToElement(driver.findElement(By.cssSelector("img[alt='Powered by Mantis Bugtracker']")))
                .contextClick()
                .perform();


        driver.quit();

    }



}


