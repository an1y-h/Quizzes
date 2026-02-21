import java.util.Scanner;
import java.io.*;

public class Six {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));

        File inputFile = new File("taskSixinput.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("task6outSpace.txt");
        in.useDelimiter(" ");

        while(in.hasNext()) {
            out.println(in.next());
        }

        in.close();
        out.close();
    }
} 