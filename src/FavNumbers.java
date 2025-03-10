import java.util.Scanner;

public class FavNumbers {


    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }


    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter your favorite integer: ");
        int favoriteInt = getInt();

        System.out.print("Enter your favorite double: ");
        double favoriteDouble = getDouble();


        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
