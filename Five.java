import java.util.Scanner;
import java.io.*;

public class Five {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));

        File inputFile = new File("inputString.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("task5out.txt");
        in.useDelimiter("[^A-Za-z]+");

        while(in.hasNext()) {
            out.println(in.next());
        }

        in.close();
        out.close();
    }
} 

