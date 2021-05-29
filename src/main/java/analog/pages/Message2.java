package analog.pages;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

public class Message2 extends BasePage {

    public void messageEmpty() throws IOException {

        processBuilder = new ProcessBuilder();

        environmentVariables = processBuilder.environment();
        environmentVariables.forEach((key, value) -> System.out.println(key + value));

        String[] cectMessEmpty = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cargo run -- cectMessEmpty.yml"};

        processBuilder
                .command(cectMessEmpty)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        System.out.println(environmentVariables);
    }


    public void messLetters() throws IOException, InterruptedException {

        processBuilder = new ProcessBuilder();

        environmentVariables = processBuilder.environment();
        environmentVariables.forEach((key, value) -> System.out.println(key + value));

        String[] cectMessLetters = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cargo run -- cectMessLetters.yml"};

        processBuilder
                .command(cectMessLetters)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        System.out.println(environmentVariables);
    }


    public void checkErrorMessage() throws IOException, InterruptedException, ExecutionException {
        processBuilder = new ProcessBuilder();

//        environmentVariables = processBuilder.environment();
//        environmentVariables.forEach((key, value) -> System.out.println(key + value));

        String[] checkOutputMessage = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cargo run"};

        processBuilder
                .command(checkOutputMessage)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        //  System.out.println(environmentVariables);

        stdOutRes = redirectToLogger(process.getInputStream(), System.out::println);
        stdErrRes = redirectToLogger(process.getErrorStream(), System.out::println);

        System.out.println(processBuilder.redirectErrorStream());

        System.out.println(stdOutRes.get());
        System.out.println(stdErrRes.get());

        System.out.println(process.waitFor());
        ProcessBuilder str = processBuilder.redirectErrorStream(true);
        System.out.println(Arrays.toString(str.toString().getBytes()));


        }
    }

