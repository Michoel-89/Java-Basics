package fileClass;

import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        
        File file = new File("fileClass/file.txt");

        System.out.println(file.getAbsolutePath());
        if (file.exists()) {
            System.out.println("file exists");
            file.delete();
        } else {
            System.out.println("file doesn't exist");
        }
    }
}
