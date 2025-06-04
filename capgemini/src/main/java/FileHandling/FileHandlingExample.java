package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        File file=new File("/home/aniket/Learnings/javaTrainingsCap/capgemini/src/main/java/FileHandling/demo.txt");
        System.out.println(file.exists());

        try {
            file.createNewFile();
            System.out.println("file is created");
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("is directory "+file.isDirectory());
        System.out.println("is file "+file.isFile());
        System.out.println("is exists "+file.exists());
        System.out.println("is readable "+file.canRead());
        System.out.println("is writable "+file.canWrite());
        System.out.println("last modified"+file.lastModified());
        System.out.println("absolute path"+file.getAbsolutePath());
        try {
            System.out.println(file.getCanonicalPath());
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
