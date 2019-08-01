package HomeWork01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test03 {

    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("d;/abc.txt")
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
