package shouty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

    @Given("Lucy is (\\d+)m from Sean")
    public void lucy_is_m_from_Sean(int arg1) {
        System.out.println(arg1);

    }

    @When("Sean shouts \"(.*?)\"$")
    public void sean_shouts(String arg1) {
        System.out.println(arg1);

    }

    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_Sean_s_message() {
        System.out.println("Close step");

    }

    @Given("Create Lucy")
    public void createLucy() {
        System.out.println("This is background scenario");

    }




}
