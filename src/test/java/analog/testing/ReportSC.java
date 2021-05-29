package analog.testing;

import analog.pages.Message2;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class ReportSC {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        Message2 m2 = new Message2();

        m2.messageEmpty();
    }
}
