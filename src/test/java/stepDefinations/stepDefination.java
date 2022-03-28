package stepDefinations;

import gherkin.ast.DataTable;
import gherkin.ast.TableRow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefination {

    @Given("^User is on banking landing page$")
    public void user_is_on_banking_login_page() throws Throwable{
    System.out.println("Test Step 1");
    }


    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
        System.out.println(string2);

    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable{
        System.out.println("Test Step 3");
    }

    @Then("Cards displayed is {string}")
    public void cards_displayed_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }
    @When("^User signup with following details$")
    public void user_signup_with_following_details(DataTable data) throws Throwable {
       List<List<String>> obj=data.asList();
        System.out.println(obj.get(0).get(0));


    }

}
