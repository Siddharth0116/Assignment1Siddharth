import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.println("Enter a year:");
        int year = scanner.nextInt();  // Read user input

        // Call the leapYear function with the input year and print the result
        System.out.println(leapYear(year));
    }

    // Create the leapYear function
    public static boolean leapYear(int year) {
        if (year % 4 != 0) {
            return false;  // Not a leap year if not divisible by 4
        } else if (year % 100 != 0) {
            return true;  // A leap year if divisible by 4 but not by 100
        } else if (year % 400 != 0) {
            return false;  // Not a leap year if divisible by 100 but not by 400
        } else {
            return true;  // A leap year if divisible by 400
        }
    }
}