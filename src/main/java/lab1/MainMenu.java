package lab1;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("LAB 1: Variant 9");
            System.out.println("1 – Task 1 (Formula)");
            System.out.println("2 – Task 2 (Radius)");
            System.out.println("3 – Task 3 (Distance)");
            System.out.println("4 – Task 5 (Calculate)");
            System.out.println("5 – Task 5 (MinDigit)");
            System.out.println("0 – Exit");
            System.out.print("Your choice: ");
            String input = scanner.nextLine();
            int choice;
            try
            {
                choice = Integer.parseInt(input);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error: invalid value entered. Please enter a number.");
                continue;
            }
            if (choice == 0)
            {
                System.out.println("Exiting program.");
                break;
            }
            else if (choice == 1)
            {
                Task1Formula.run();
            }
            else if (choice == 2)
            {
                Task2Radius.run();
            }
            else if (choice == 3)
            {
                Task3Distance.run();
            }
            else if (choice == 4)
            {
                Task4Calculate.run();
            }
            else if (choice == 5)
            {
                Task5MinDigit.run();
            }
            else
            {
                System.out.println("Invalid choice. This menu item does not exist.");
            }
        }
        scanner.close();
    }
}