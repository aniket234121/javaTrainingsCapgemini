package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/aniket/Learnings/javaTrainingsCap/capgemini/src/main/java/FileHandling/ReadData.java");
        try {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("===================================================================================================");

        FileReader fr=new FileReader("/home/aniket/Learnings/javaTrainingsCap/capgemini/src/main/java/FileHandling/FileHandlingExample.java");
        int data=fr.read();
        while(data!=-1){
            System.out.print((char)data);
            data=fr.read();
        }
    }
}
