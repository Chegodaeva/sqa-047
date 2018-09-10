package shouty;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Stepdefs {

    public WebDriver driver;


    @Given("(\\w+) (?:is|is standing) (\\d*) metres? from (\\w+)")
    public void lucyIsMetresFromSean(String name, String distance, String name2) {

    }



    @When("Sean shouts \"Free bagels\"")
    public void seanShouts() {

    }

    @Then("Lucy should hear Sean's message")
    public void lucyShouldHearSeanSMessage() {


    }

    @Then("Lucy pay (\\d*) (?:dollars|dollar|cent)")
    public void lucy_pay_dollars(String summ) {
        System.out.println(summ);

    }

    @Given("I meet Lucy")
    public void i_meet_Lucy() {
            return;
    }

    @Given("I have runnung browser")
    public void i_have_runnung_browser() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Then("I open Google Page")
    public void i_open_Google_Page() {
        driver.get("https://google.com");
        driver.quit();


    }


}


