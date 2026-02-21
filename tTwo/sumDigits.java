package cEleven.tTwo;
import java.util.Scanner;
import java.io.*;

public class sumDigits {
    public static void main(String[] args) throws FileNotFoundException {
    //System.out.println("user.dir");
    System.out.println(System.getProperty("user.dir"));

    File inputFile = new File("inputDigits.txt");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("output_sum.txt");

    //double add = in.nextDouble();
    double sum = in.nextDouble();
    while(in.hasNextDouble()) {
        //System.out.println(in.nextDouble());
        //out.println(in.nextDouble());
        sum += in.nextDouble();
    }
    out.println(sum);

    in.close();
    out.close();
    }
}