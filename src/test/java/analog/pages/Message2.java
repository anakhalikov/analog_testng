package analog.pages;

import org.junit.Assert;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Message2 extends BasePage {

    static String expected;
    static String actual;

    public void messageEmpty() throws IOException, InterruptedException {
        processBuilder = new ProcessBuilder();

        String[] cectMessEmpty = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cmd.exe > messEmpty.txt 2>&1" , "cmd.exe", "/k", "cargo run -- cectMessEmpty.yml",
                "cmd.exe", "/k", "exit"};

        processBuilder
                .command(cectMessEmpty)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();
    }


    public void messLetters() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] cectMessLetters = {"cmd.exe", "/c", "start", "cmd.exe", "/k",  "cmd.exe > messLet.txt 2>&1" , "cmd.exe", "/k", "cargo run -- cectMessLetters.yml"};

        processBuilder
                .command(cectMessLetters)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

    }


    public void runMessageByDefault() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] checkOutputMessage = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cmd.exe > default.txt 2>&1" , "cmd.exe", "/k", "cargo run"};

        processBuilder
                .command(checkOutputMessage)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        }

    public void messageValidNumbersResult() throws FileNotFoundException {

        String path = "C:\\Users\\lien8\\cect\\default.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

        actual = "";
        expected = "Error";

        for(int i = 0; i < list.size(); i++){
            expected = list.get(i);
        }
        if (!actual.contains(expected)) {
            System.out.println("******* Pass!!! Valid type entered");
        } else {
            System.out.println("******* Fail!!! Invalid type entered");
        }
    }

    public void checkMessageEmptyStatus() throws FileNotFoundException {

        String path = "C:\\Users\\lien8\\cect\\messEmpty.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

        actual = "";
        expected = "Error";

        for(int i = 0; i < list.size(); i++){
            expected = list.get(i);
        }
        if (actual.contains(expected)) {
            System.out.println("******* Fail!!! Valid type entered");
        } else {
            System.out.println("******* Pass!!! Invalid type entered");
        }
    }

    public void checkMessageLettersStatus() throws FileNotFoundException {

        String path = "C:\\Users\\lien8\\cect\\messLet.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

         actual = "";
         expected = "Error";

        for(int i = 0; i < list.size(); i++){
            expected = list.get(i);
        }
            if (actual.contains(expected)) {
                System.out.println("******* Fail!!! Valid type entered");
            } else {
                System.out.println("******* Pass!!! Invalid type entered");
        }
    }

}

