package JavaProgramsOnNumbers;

import java.util.Scanner;

public class PallindromeCheck {

    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int m = num; int sum = 0;
        int s=num;

        while (num > 0) {
            m = num % 10;
            sum = sum * 10 + m;
            num = num / 10;
        }

        if (sum == s) {
            System.out.println("Yes! Number "+ sum + " is Pallindrome.");
        }

        else {
            System.out.println("No! Number "+ sum   + " is not Pallindrome.");
        }
    }
}
