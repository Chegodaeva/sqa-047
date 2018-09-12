package shouty;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Stepdefs {

    WebDriver driver;

    @Given("I open login page")
    public void iOpenLoginPage() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://shipovalov.net/login_page.php");

    }

    @When("I fill login form")
    public void iFillLoginForm() throws InterruptedException {
        driver.findElement(By.cssSelector("form[name='login_form']"))
                .findElement(By.cssSelector("input[name='username']"));


        driver.findElement(By.cssSelector("input[name='password']"));


        List<WebElement> elem = driver.findElements(By.cssSelector("div.button"));
        System.out.println(elem.size());
        driver.quit();
    }


}


