import java.io.*;
import java.util.Scanner;

public class ReadingMixOfStringsAndNumbersScannerByLineSum {
    public static void main(String[]args) throws FileNotFoundException{
        //files
        String inputF = "worldpopByLine.txt";
        String outputF = "worldpopByLineOutput.txt";

        //country number
        int countryNum = 0;
        //population sum
        long popSum = 0;

        //read file and output file
        Scanner in = new Scanner(new File(inputF));
        PrintWriter out = new PrintWriter(outputF);

        while(in.hasNextLine()){
            String country = in.nextLine();//.trim();
            long pop = Long.parseLong(in.nextLine()); //longparse  no work: int, double

            //adds up the amount of countries
            countryNum++;
            //add the populations together
            popSum += pop;
            //print out the country and population for each one
            out.println("The country is " + country + " (Population: " + pop + ")");
        }
        out.println("A total of " + countryNum + " countries have been found, with a total of " + popSum + ".");

        in.close();
        out.close();
    }
}
