package analog.step.definitions;

import analog.pages.Report;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReportStepDefinition {

   Report report = new Report();

    @Given("User enter white space in report_period field")
    public void user_enter_white_space_in_report_period_field() throws IOException {
        report.reportWS();
    }

    @Then("User see error white space report_period result")
    public void user_see_error_white_space_report_period_result() throws FileNotFoundException {
        report.checkReportWSStatus();
    }

    @Given("User enter special chars in report_period field")
    public void user_enter_special_chars_in_report_period_field() throws IOException {
        report.reportSC();
    }

    @Then("User see error special chars result")
    public void user_see_error_special_chars_result() throws FileNotFoundException {
        report.checkReportErrorStatus();
    }

}
