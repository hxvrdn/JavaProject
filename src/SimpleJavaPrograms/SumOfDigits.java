package SimpleJavaPrograms;

import java.util.Scanner;

public class SumOfDigits {
    public static void logic() {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int digit;
        int num = sc.nextInt();
        int n = num;

        while (num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("The sum of the digit of given number " + n+ " is "+ sum);
    }
}
