package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginStepDefination {

    @Given("^: User is on Netbanking login Page$")
    public void _user_is_on_netbanking_login_page()  {
    	System.out.println("_user_is_on_netbanking_login_page");
        //throw new PendingException();
    }

    @When("^: User login into application with username ans password$")
    public void _user_login_into_application_with_username_ans_password()  {
    	System.out.println("_user_login_into_application_with_username_ans_password");
        
    }

    @Then("^: Home page is populated$")
    public void _home_page_is_populated()  {
    	System.out.println("_home_page_is_populated");      
    }

    @And("^: Cards are displayed$")
    public void _cards_are_displayed()  
    {
    	System.out.println("_cards_are_displayed");
      
    }

}