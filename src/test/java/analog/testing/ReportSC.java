package analog.testing;

import analog.pages.RunningShellCommand;

import java.io.IOException;

public class ReportSC {

    public static void main(String[] args) throws IOException, InterruptedException {

        RunningShellCommand rsc = new RunningShellCommand();

        rsc.reportSC();

       // rsc.checkErrorMessage();
    }
}
