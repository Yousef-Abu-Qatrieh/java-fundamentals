/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.*;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";

    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());
        gatesReader();

    }


    public static void gatesReader() throws IOException {
        FileReader file = new FileReader("app/src/main/resources/gates.js");
        BufferedReader bufferedReader = new BufferedReader(file);
        int counter = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            
            if (bufferedReader.readLine().isEmpty()) {
                counter++;
                continue;
            }
            if (bufferedReader.readLine().endsWith("{")) {
                counter++;
                continue;
            }
            if (bufferedReader.readLine().endsWith("}")) {
                counter++;
                continue;
            }
            if (bufferedReader.readLine().contains("if") || bufferedReader.readLine().contains("else")) {
                counter++;
                continue;
            }
            if (bufferedReader.readLine().contains("return") && !bufferedReader.readLine().endsWith(";")) {

                System.err.println("Line" + counter + ": Missing semicolon.");

            }
            bufferedReader.readLine();


            counter++;


        }
    }
}










