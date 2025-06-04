package FileHandling;

import java.io.*;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) {

        File file = new File("/home/aniket/Learnings/javaTrainingsCap/capgemini/src/main/java/FileHandling/demo.txt");

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the string you want to write to the file:");
        String userInput = inputScanner.nextLine();

        // Step 1: Read existing file content
        StringBuilder sb = new StringBuilder();
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                sb.append(fileScanner.nextLine()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Step 2: Append new input and write back
        sb.append(userInput).append("\n");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Step 3: Read the file again to print updated content
        System.out.println("\nUpdated file content:");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}


