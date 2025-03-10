import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner in, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = in.nextLine();
            if (input.length() > 0) {
                return input;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
    }
}
