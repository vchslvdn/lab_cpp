package lab1;
import java.util.Scanner;

public class Task3Distance {
    public static void run() {
        System.out.println("Test run");
        double tx1 = -1, ty1 = 2;
        double tx2 = 2,  ty2 = 6;
        double testDistance = Math.sqrt((tx2 - tx1) * (tx2 - tx1) + (ty2 - ty1) * (ty2 - ty1));
        System.out.println("A(" + tx1 + ", " + ty1 + "), B(" + tx2 + ", " + ty2 + ")");
        System.out.println("Distance = " + testDistance);

        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        double x1, y1, x2, y2;

        while (true) {
            System.out.print("Enter x1: ");
            if (scan.hasNextDouble())
            {
                x1 = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number."); scan.next();
        }
        while (true)
        {
            System.out.print("Enter y1: ");
            if (scan.hasNextDouble())
            {
                y1 = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number."); scan.next();
        }
        while (true)
        {
            System.out.print("Enter x2: ");
            if (scan.hasNextDouble())
            {
                x2 = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number."); scan.next();
        }
        while (true)
        {
            System.out.print("Enter y2: ");
            if (scan.hasNextDouble())
            {
                y2 = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number."); scan.next();
        }
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance = " + distance);
    }
}
