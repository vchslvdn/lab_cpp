package lab1;
import java.util.Scanner;

public class Task2Radius {
    public static void run() {
        System.out.println("Test run");
        double testR = 6.0;
        double testLength = 2 * Math.PI * testR;
        System.out.println("R = " + testR);
        System.out.println("Circle length = " + testLength);

        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        double R;
        while (true)
        {
            System.out.print("Enter radius: ");
            if (scan.hasNextDouble())
            {
                R = scan.nextDouble();
                if (R > 0)
                    break;
            }
            System.out.println("Error: radius must be a positive number.");
            scan.next();
        }
        double length = 2 * Math.PI * R;
        System.out.println("Circle length = " + length);
    }
}
