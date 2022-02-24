/**
 * todo Document type Converter
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) throws IOException {
    Path path = Paths.get("C:/Users/Myagkov/projects/Converter/src/test.txt");
    String content = Files.readString(path);
    String[] tokens = content.split("/");
    System.out.println("Введите сумму:");
    Scanner myScanner = new Scanner(System.in);
    float value = myScanner.nextFloat();
    for (String t : tokens){
        float f = Float.parseFloat(t);
        String result = String.valueOf(value / f);
        System.out.println(result);
    }





    }

}
