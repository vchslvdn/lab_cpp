package lab1;
import java.util.Scanner;

public class Task4Calculate {
    public static void run() {
        System.out.println("Test run");
        double testA = 2;
        double ta2 = testA * testA;
        double ta4 = ta2 * ta2;
        double testA7 = ta4 * ta2 * testA;
        System.out.println("a = " + testA);
        System.out.println("a^7 = " + testA7);

        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        double a;

        while (true)
        {
            System.out.print("Enter a: ");
            if (scan.hasNextDouble())
            {
                a = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number.");
            scan.next();
        }
        double a2 = a * a;
        double a4 = a2 * a2;
        double a7 = a4 * a2 * a;
        System.out.println("a^7 = " + a7);
    }
}
