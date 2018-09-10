package shouty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.List;

public class Stepdefs {

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



    @Given("I have dataTable")
    public void i_have_dataTable(List<List<String>> table) {
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(i).size(); j++) {
            System.out.println(table.get(i).get(j));
        }
        }


    }

}


