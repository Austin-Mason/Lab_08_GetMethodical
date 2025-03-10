import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reggie {


    public static String getRegExString(Scanner in, String prompt, String pattern) {
        String input;
        while (true) {
            System.out.print(prompt + ": ");
            input = in.nextLine().trim();
            if (input.matches(pattern)) {
                return input;
            } else {
                System.out.println("Invalid input. Please follow the correct format.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String ssn = getRegExString(scanner, "Enter a valid SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN Accepted: " + ssn);


        String mNumber = getRegExString(scanner, "Enter a UC Student M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("M Number Accepted: " + mNumber);


        String menuChoice = getRegExString(scanner, "Enter a menu choice (O/S/V/Q)", "^[OoSsVvQq]$");
        System.out.println("Menu Choice Accepted: " + menuChoice.toUpperCase());
    }
}

