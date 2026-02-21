import java.util.Scanner;
import java.io.*;

public class CountString {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println("user.dir");
        System.out.println(System.getProperty("user.dir"));

        File inputFile = new File("inputStrings.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("output_count.txt");
        in.useDelimiter(""); 
        
        int letterCount = 0;
        int wordCount = 1;
        while(in.hasNext()) {
            //System.out.println(in.nextDouble());
            char ch = in.next().charAt(0);
            out.println(ch);

            if (ch != ' ' ){
                letterCount++;
            }
            else{
                wordCount++;
            }
            
        } 
        out.println("letter count: " + letterCount);
        out.println("word count: " + wordCount);
        
        in.close();
        out.close();
    }
}
