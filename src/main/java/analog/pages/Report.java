package analog.pages;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static analog.pages.RunningShellCommand.redirectToLogger;

public class Report extends BasePage{

    public void reportSC() throws IOException, InterruptedException, ExecutionException {
        processBuilder = new ProcessBuilder();
//
//        environmentVariables = processBuilder.environment();
//        environmentVariables.forEach((key, value) -> System.out.println(key + value));
//
//        Map<String, String> environment = processBuilder.environment();
//        processBuilder.redirectErrorStream(true);

        String[] cectReportSC = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cargo run -- cectReportSC.yml"};

        processBuilder
                .command(cectReportSC)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        stdOutRes = redirectToLogger(process.getInputStream(), System.out::println);
        stdErrRes = redirectToLogger(process.getErrorStream(), System.out::println);

        System.out.println(processBuilder.redirectErrorStream());

        System.out.println(stdOutRes.get());
        System.out.println(stdErrRes.get());

        System.out.println(process.waitFor());

        ProcessBuilder str = processBuilder.redirectErrorStream(true);
        System.out.println(Arrays.toString(str.toString().getBytes()));


        //            System.out.println(environmentVariables);
//
//        boolean actualReportSCresult = processBuilder.redirectErrorStream();
//        boolean expectedReportSCresult = false;
//   //     System.out.println(actualReportSCresult);
//        if(actualReportSCresult == expectedReportSCresult){
//            System.out.println("****** Your test is FAILED, please enter corrected TYPES of result");
//        }
    }


    public void checkErrorStatus() {

//        boolean actualReportSCresult = processBuilder.equals(false);
//        boolean expectedReportSCresult = false;
//        //     System.out.println(actualReportSCresult);
//        if(actualReportSCresult == expectedReportSCresult){
//            System.out.println("****** Your test is FAILED, please enter corrected TYPES of result");
//        }
//        System.out.println("******* PASS!!!!");
    }
}
