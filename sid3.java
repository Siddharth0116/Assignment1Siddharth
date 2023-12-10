import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter an age:");
        int age = scanner.nextInt();  // Read user input

        if (age > 18) {
            System.out.println("Older than 18");
        } else if (age > 13) {
            System.out.println("Older than 13");
        } else if (age > 0) {
            System.out.println("Older than 0");
        } else if (age<0)   {
            System.out.println("Age is less than 0");
        } else{
             System.out.println("Age is 0");
              /*age is 0*/   
        }
    }
}
