package lab1;
import java.util.Scanner;

public class Task1Formula {
    public static void run() {
        System.out.println("Test run");
        double testX = 2, testY = 3;
        double testA = (testX * testX) + (testY * testY);
        System.out.println("x = " + testX + ", y = " + testY);
        System.out.println("A = " + testA);

        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        double x, y;

        while (true) {
            System.out.print("Enter x: ");
            if (scan.hasNextDouble())
            {
                x = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number.");
            scan.next();
        }
        while (true) {
            System.out.print("Enter y: ");
            if (scan.hasNextDouble())
            {
                y = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number.");
            scan.next();
        }
        double A = (x * x) + (y * y);
        System.out.println("Result A = " + A);
    }
}
