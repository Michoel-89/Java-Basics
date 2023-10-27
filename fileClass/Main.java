package fileClass;

import java.io.FileReader;
// import java.io.File;
// import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.read();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }    
        // File file = new File("fileClass/file.txt");

        // System.out.println(file.getAbsolutePath());
        // if (file.exists()) {
        //     System.out.println("file exists");
        //     file.delete();
        // } else {
        //     System.out.println("file doesn't exist");
        // }
        // try {
        //     FileWriter writer = new FileWriter("fileClass/poem.txt");
        //     writer.write("roses are read \nviolets are blue");
        //     writer.close();
        // }
        // catch (Exception e) {

        //     e.printStackTrace();
        // }
    }
}
