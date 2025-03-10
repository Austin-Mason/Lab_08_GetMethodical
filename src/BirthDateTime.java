import java.util.Scanner;

public class BirthDateTime {


    public static int getRangedInt(Scanner in, String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt + " (" + min + "-" + max + "): ");
            if (in.hasNextInt()) {
                input = in.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for birth year, month, and day
        int year = getRangedInt(scanner, "Enter your birth year", 1950, 2015);
        int month = getRangedInt(scanner, "Enter your birth month", 1, 12);


        int maxDays;
        switch (month) {
            case 2:
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }

        int day = getRangedInt(scanner, "Enter your birth day", 1, maxDays);
        int hour = getRangedInt(scanner, "Enter your birth hour", 1, 24);
        int minute = getRangedInt(scanner, "Enter your birth minute", 1, 59);


        System.out.println("\nYou were born on: " + year + "-" + month + "-" + day + " at " + hour + ":" + minute);
    }
}

