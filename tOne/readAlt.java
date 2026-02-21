import java.util.Scanner;
import java.io.*;

public class readAlt {
    public static void main(String[] args) throws FileNotFoundException {
    //System.out.println("user.dir");
    System.out.println(System.getProperty("user.dir"));

    File inputFile = new File("inputDigits.txt");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("outputAlt.txt");

    while(in.hasNext()) {
        //System.out.println(in.nextDouble());
        out.println(in.next());
    }
    in.close();
    out.close();
    }
}