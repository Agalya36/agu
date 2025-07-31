import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to Java Programming.");

        input.close();
    }
