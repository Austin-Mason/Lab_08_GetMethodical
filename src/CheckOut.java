import java.util.Scanner;

public class CheckOut {


    public static double getRangedDouble(Scanner in, String prompt, double min, double max) {
        double input;
        while (true) {
            System.out.print(prompt + " ($" + min + " - $" + max + "): ");
            if (in.hasNextDouble()) {
                input = in.nextDouble();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Invalid input. Please enter a price between $" + min + " and $" + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid price.");
                in.next();
            }
        }
    }


    public static boolean getYNConfirm(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt + " (Y/N): ");
            String response = in.next().trim().toLowerCase();
            if (response.equals("y")) {
                return true;
            } else if (response.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;


        do {
            double price = getRangedDouble(scanner, "Enter the price of your item", 0.50, 10.00);
            total += price;
        } while (getYNConfirm(scanner, "Do you have another item?"));


        System.out.printf("\nYour total purchase amount is: $%.2f\n", total);
    }
}

