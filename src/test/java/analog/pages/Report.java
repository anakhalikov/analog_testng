package analog.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;

public class Report extends BasePage {

    public void reportSC() throws IOException {
        processBuilder = new ProcessBuilder();

        String[] cectReportSC = {"cmd.exe", "/c", "start", "cmd.exe", "/k","cmd.exe > file.txt 2>&1" , "cmd.exe", "/k","cargo run -- cectReportSC.yml"};

        processBuilder
                .command(cectReportSC)
                .directory(new File("C:\\Users\\lien8\\cect"));
        process = processBuilder.start();

    }

    public void checkReportErrorStatus() throws FileNotFoundException {

        String path = "C:\\Users\\lien8\\cect\\file.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNext()){
            list.add(scanner.nextLine());
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("invalid type:")){
            }
        }
        System.out.println("******* ERROR!!!! You are entered in report_period invalid value, please enter valid ");

    }


}

