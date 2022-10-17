import java.util.regex.Pattern;
import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text"));

        //Edit these lines to advance the scanner
        sc.nextLine();



        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions

        String pattern = sc.findInLine("BlueBumper");
        System.out.println("sc.findInLine(ava): " + pattern);

        System.out.println("X: "        +", Y: "        );
        sc.close();
    }
}
