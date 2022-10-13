import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int a =sc.nextInt();
        System.out.println("Input Second Number");
        int b =sc.nextInt();
        System.out.println("Input Third Number");
        int c =sc.nextInt();
        System.out.println("Sum: "+(a+b+c));
        //Find and print the sum of three integers entered by the user




        //Remember to close the Scanner
        sc.close();
    }
}
