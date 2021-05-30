package analog.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;

public class Report extends BasePage {

    static String expected;
    static String actual;

    public void reportSC() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] cectReportSC = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cmd.exe > reptSC.txt 2>&1", "cmd.exe", "/k", "cargo run -- cectReportSC.yml"};

        processBuilder
                .command(cectReportSC)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

    }

    public void checkReportErrorStatus() throws FileNotFoundException {

        String path = "C:\\Users\\lien8\\cect\\reptSC.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        actual = "";
        expected = "Error";

        for (int i = 0; i < list.size(); i++) {
            expected = list.get(i);
        }
        if (actual.contains(expected)) {
            System.out.println("******* Fail!!! Valid type entered");
        } else {
            System.out.println("******* Pass!!! Invalid type entered");
        }
    }

    public void reportWS() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] cectReportWS = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cmd.exe > reptWS.txt 2>&1", "cmd.exe", "/k", "cargo run -- cectReportWS.yml"};

        processBuilder
                .command(cectReportWS)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();
    }

    public void checkReportWSStatus() throws FileNotFoundException {

        String path = "C:\\Users\\lien8\\cect\\reptWS.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

        actual = "";
        expected = "Error";

        for (int i = 0; i < list.size(); i++) {
            expected = list.get(i);
        }
        if (actual.contains(expected)) {
            System.out.println("******* Fail!!! Valid type entered");
        } else {
            System.out.println("******* Pass!!! Invalid type entered");
        }

    }
}


