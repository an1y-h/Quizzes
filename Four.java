import java.util.Scanner;
import java.io.*;

public class Four {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));

        File inputFile = new File("inputString.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("task4out.txt");
        in.useDelimiter("[^A-Za-z]+");

        while(in.hasNext()) {
            out.println(in.next());
        }

        in.close();
        out.close();
    }
}