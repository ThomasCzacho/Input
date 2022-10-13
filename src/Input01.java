import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type Something");


        //Parse the input as an int.
        //Print its value +1
        int input2= Integer.parseInt(input);
        System.out.println(++input2);

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int input3= Integer.parseInt(JOptionPane.showInputDialog("Type Something"));
        System.out.println(++input3);
    }
}
