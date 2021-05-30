package java.analog.step.definitions;

import java.analog.step.definitions.BaseTest;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReportTest extends BaseTest {

    public void reportSpecialCharsTest() throws IOException{
        report.reportSC();
    }

    public void reportStatusTest() throws FileNotFoundException {
        report.checkReportErrorStatus();
    }

}
