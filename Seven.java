import java.util.Scanner;
import java.io.*;

public class Seven {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));

        File inputFile = new File("taskSeveninput.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("task7out.txt");
        in.useDelimiter("@");

        String blank = in.next();
        while(in.hasNext()) {
            out.println("User name is: " + blank);
            blank = in.next();
        }
        out.println("Server is: " + blank);

        in.close();
        out.close();
    }
} 