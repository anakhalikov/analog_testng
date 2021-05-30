package analog.pages;

import java.io.*;

public class Message2 extends BasePage {

    public void messageEmpty() throws IOException{
        processBuilder = new ProcessBuilder();

        String[] cectMessEmpty = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cmd.exe > file.txt 2>&1" , "cmd.exe", "/k", "cargo run -- cectMessEmpty.yml"};

        processBuilder
                .command(cectMessEmpty)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();
    }


    public void messLetters() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] cectMessLetters = {"cmd.exe", "/c", "start", "cmd.exe", "/k",  "cmd.exe > file.txt 2>&1" , "cmd.exe", "/k", "cargo run -- cectMessLetters.yml"};

        processBuilder
                .command(cectMessLetters)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

    }


    public void runMessageByDefault() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] checkOutputMessage = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "cmd.exe > file.txt 2>&1" , "cmd.exe", "/k", "cargo run"};

        processBuilder
                .command(checkOutputMessage)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

        }
    }

