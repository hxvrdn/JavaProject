package JavaProgramsOnNumbers;

import java.util.Scanner;
import java.util.Scanner;

public class CheckArmstrongNumber {



    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers cannot be Armstrong numbers.");
            sc.close();
            return;
        }

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
}
