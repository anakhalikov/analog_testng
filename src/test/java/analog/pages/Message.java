package java.analog.pages;

import java.analog.pages.BasePage;
import java.util.Scanner;

public class Message extends BasePage {

    Scanner sc;
    char character;

    public void enterNumMess() {
        sc = new Scanner(System.in);
        System.out.println("Please enter numbers of messages: ");
        character = sc.next().charAt(0);

        boolean isLetter = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //upper case letters & lower case letter

        boolean isNum = character >= 48 && character <= 57;
        //numbers

        if (isLetter) {
                System.out.println("****** Test is failed, You entered letters, Please provide numbers ");
        } else {
            if (isNum) {
                System.out.println("****** Test is Passed, You entered numbers ");
            } else {
                System.out.println("****** Test is failed, You entered special chars, Please provide numbers ");
            }
        }
    }



}



