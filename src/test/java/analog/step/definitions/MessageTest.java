package java.analog.step.definitions;

import java.io.IOException;

public class MessageTest extends BaseTest {


    public void checkIfMessageIsEmptyTest() throws IOException {
        message2.messageEmpty();
    }

    public void checkIfMessageContainsLettersTest() throws IOException {
        message2.runMessageByDefault();
    }


    }
