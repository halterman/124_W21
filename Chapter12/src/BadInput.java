import java.util.InputMismatchException;
import java.util.Scanner;

public class BadInput {

    public static void main(String[] args) {
 System.out.print("Give a number, and I will double it: ");
        Scanner scan = new Scanner(System.in);
        boolean goodInput = false;
        while (!goodInput) {
            try {
                int input = scan.nextInt();
                goodInput = true;
                scan.close();
                System.out.println(2*input);
            } catch (InputMismatchException e) {
                scan.nextLine();  // Read (and clear) the current input line
                System.out.print("I was not expecting that, please try again: ");
            }
        }

    }

}
