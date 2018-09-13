package shouty;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

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
                .findElement(By.cssSelector("input[name='username']"));


        driver.findElement(By.cssSelector("input[name='password']"));


        driver.findElement(By.cssSelector("input.button"));
        WebDriverWait wait =new WebDriverWait(driver, 5, 1000);

        wait.until(elementToBeClickable(By.linkText("Logout")));


        driver.quit();
    }


}


