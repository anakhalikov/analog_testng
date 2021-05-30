package analog.step.definitions;

import analog.pages.Message2;
import analog.pages.Report;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MessageStepDefinition {

    Message2 message2 = new Message2();

    @Given("User enter valid numbers of messages")
    public void user_enter_valid_numbers_of_messages() throws IOException {
        message2.runMessageByDefault();
    }

    @Then("User see pass number result")
    public void user_see_pass_number_result() throws FileNotFoundException {
        message2.messageValidNumbersResult();
    }

    @Given("User leave empty numbers of messages")
    public void user_leave_empty_numbers_of_messages() throws IOException, InterruptedException {
        message2.messageEmpty();
    }

    @Then("User see error empty result")
    public void user_see_error_empty_result() throws FileNotFoundException {
        message2.checkMessageEmptyStatus();
    }

    @Given("User enter letters in  messages field")
    public void user_enter_letters_in_messages_field() throws IOException {
        message2.messLetters();
    }

    @Then("User see error letters result")
    public void user_see_error_letters_result() throws FileNotFoundException {
        message2.checkMessageLettersStatus();
    }

}
