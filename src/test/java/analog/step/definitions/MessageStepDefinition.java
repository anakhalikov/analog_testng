package analog.step.definitions;

import analog.pages.Message2;
import analog.pages.Report;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MessageStepDefinition {

    Message2 message = new Message2();
    Report report = new Report();

      //  message.runMessageByDefault();
       // message.messageEmpty();
      //  report.checkReportErrorStatus();
      //  message.messLetters();


    @Given("User enter valid numbers of messages")
    public void user_enter_valid_numbers_of_messages() throws IOException {
        message.runMessageByDefault();

    }


    @Then("User see pass number result")
    public void user_see_pass_number_result() {

    }


    @Given("User leave empty numbers of messages")
    public void user_leave_empty_numbers_of_messages() throws IOException {
        message.messageEmpty();
    }

    @Then("User see error empty result")
    public void user_see_error_empty_result() throws FileNotFoundException {
        report.checkReportErrorStatus();

    }

    @Given("User enter letters in  messages field")
    public void user_enter_letters_in_messages_field() {

    }


    @Then("User see error letters result")
    public void user_see_error_letters_result() {

    }

}
