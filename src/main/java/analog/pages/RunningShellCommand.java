package analog.pages;

import org.apache.hc.core5.util.Asserts;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class RunningShellCommand {

    static ProcessBuilder processBuilder;
    static Process process;
    static Map<String, String> environmentVariables;

    public void messageEmpty() throws IOException {

        processBuilder = new ProcessBuilder();

        environmentVariables  = processBuilder.environment();
        environmentVariables.forEach((key, value) -> System.out.println(key + value));

        String[] cectMessEmpty = {"cmd.exe", "/c", "start",  "cmd.exe", "/k", "cargo run -- cectMessEmpty.yml" };

        processBuilder
                .command(cectMessEmpty)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        System.out.println(environmentVariables);
    }


    public void messLetters() throws IOException, InterruptedException {

        processBuilder = new ProcessBuilder();

        environmentVariables  = processBuilder.environment();
        environmentVariables.forEach((key, value) -> System.out.println(key + value));

        String[] cectMessLetters = {"cmd.exe", "/c", "start",  "cmd.exe", "/k", "cargo run -- cectMessLetters.yml" };

        processBuilder
                .command(cectMessLetters)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        System.out.println(environmentVariables);
    }


    public void reportSC() throws IOException, InterruptedException {
        processBuilder = new ProcessBuilder();
//
//        environmentVariables = processBuilder.environment();
//        environmentVariables.forEach((key, value) -> System.out.println(key + value));
//

        String[] cectReportSC = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cargo run -- cectReportSC.yml" };

        processBuilder
                .command(cectReportSC)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();


//        process.waitFor();
//        BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String line = "";
//        while ((line=buf.readLine())!=null) {
//            System.out.println(line);
//        }

        InputStream is = process.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        int r = process.waitFor(); // Let the process finish.
        if (r == 0) { // No error
            // run cmd2.
        }


    //    System.out.println(environmentVariables);
//
//        boolean actualReportSCresult = processBuilder.redirectErrorStream();
//        boolean expectedReportSCresult = false;
//   //     System.out.println(actualReportSCresult);
//        if(actualReportSCresult == expectedReportSCresult){
//            System.out.println("****** Your test is FAILED, please enter corrected TYPES of result");
//        }


    }


    public void checkErrorMessage() throws IOException {
        processBuilder = new ProcessBuilder();
//
//        environmentVariables = processBuilder.environment();
//        environmentVariables.forEach((key, value) -> System.out.println(key + value));
//

        String[] checkOutputMessage = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cargo run"};

        processBuilder
                .command(checkOutputMessage)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();


//
//        boolean actualReportSCresult = processBuilder.equals(false);
//        boolean expectedReportSCresult = false;
//        //     System.out.println(actualReportSCresult);
//        if(actualReportSCresult == expectedReportSCresult){
//            System.out.println("****** Your test is FAILED, please enter corrected TYPES of result");
//        }
//        System.out.println("******* PASS!!!!");


    }




}











