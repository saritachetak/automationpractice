package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
    @Given("^I am a chrome user$")
    public void  method1(){
        System.out.println(" my given statement");
    }
    @When("^I access google.com$")
        public void method2(){
            System.out.println("my given statement2");
    }
    @Then ("^I see google1 search page$")
        public void method3(){
                System.out.println("I am a google search user");
            }

}







