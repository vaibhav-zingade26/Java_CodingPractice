package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Throws_1 {
    public static void readFile(String filename) throws FileNotFoundException {
        FileReader fs= new FileReader(filename);
    }
    public static void main(String[] args) throws IOException {
        try {
            readFile("vaibhav");
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("sokkd");
        }
    }
}
