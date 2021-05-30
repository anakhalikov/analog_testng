package java.analog.pages;

import java.io.*;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class BasePage {

    static ProcessBuilder processBuilder;
    static Process process;
    static Map<String, String> environmentVariables;
    static CompletableFuture<Boolean> stdOutRes;
    static CompletableFuture<Boolean> stdErrRes;

    static CompletableFuture<Boolean> redirectToLogger(final InputStream inputStream,
                                                       final Consumer<String> logLineConsumer) {
        return CompletableFuture.supplyAsync(() -> {
            try (
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            ) {
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    logLineConsumer.accept(line);
                }
                return true;
            } catch (IOException e) {
                return false;
            }
        });
    }
}





