import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "message",
                "Your Error:",
                0);


        String input1 = (String)JOptionPane.showInputDialog(null,
                "Type a Number",
                "Dialog Title",
                2,
                null,
                null,
                "Any Number");


        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

        int input11= Integer.parseInt(input1);
input11++;
        System.out.println(input11);

    }
}
