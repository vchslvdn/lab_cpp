package lab1;
import java.util.Scanner;

public class Task5MinDigit {
    public static void run() {
        System.out.println("Test run");
        int testN = 7084;
        int t = testN;
        int testMinDigit = 9;
        while (t > 0)
        {
            if ((t % 10) < testMinDigit) testMinDigit = t % 10;
            t /= 10;
        }
        System.out.println("N = " + testN);
        System.out.println("Minimum digit = " + testMinDigit);

        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        int N;

        while (true)
        {
            System.out.print("Enter integer N: ");
            if (scan.hasNextInt())
            {
                N = scan.nextInt();
                break;
            }
            System.out.println("Error: enter an integer.");
            scan.next();
        }
        int temp = Math.abs(N);
        int minDigit = 9;
        if (temp == 0) {
            minDigit = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                temp /= 10;
            }
        }
        System.out.println("Minimum digit = " + minDigit);
    }
}
