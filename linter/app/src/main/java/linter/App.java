/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";

    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        gatesReader();
    }

public static void gatesReader(){
        File file=new File("src/main/resources/gates.js");

        try(Scanner scanner=new Scanner(file)) {
            while (scanner.hasNextLine()){
                if (scanner.nextLine().isEmpty()){
                    continue;
                }
                if (scanner.nextLine().endsWith("{")){
                    continue;
                }
            if (scanner.nextLine().endsWith("}")){
                continue;
            }
            if (scanner.nextLine().contains("if")||scanner.nextLine().contains("else")){
                continue;
            }
            else if(! scanner.nextLine().endsWith(";")) {
              System.err.println("Line : Missing semicolon.");
            }
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
}

}