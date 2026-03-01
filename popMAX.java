import java.util.Scanner;
import java.io.*;

public class popMAX{
    public static void main(String[] args) throws FileNotFoundException{
        String inputF = "worldpopEqual.txt";
        String outputF = "WorldPopMAX.txt";

        String maxCon = "";
        int maxPop = 0;

        Scanner in = new Scanner(new File(inputF));
        PrintWriter out = new PrintWriter(outputF);

        while(in.hasNextLine()){
            String line = in.nextLine().trim();
            line = line.replace("=", " ");

            Scanner in2 = new Scanner(line);
            String country = in2.next();
        
            while(in2.hasNext() && !in2.hasNextInt()){
                country = country + " " + in2.next();
            }

            if(in2.hasNextInt()){
                int pop = in2.nextInt();
                if(pop>maxPop){
                    maxPop = pop;
                    maxCon = country;
                }
            }
            in2.close();
        }
        out.print("The country with maximum population is " + maxCon.trim() + ", and the number is " + maxPop);

        in.close();
        out.close();
    }
}