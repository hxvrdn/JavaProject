package JavaProgramsOnNumbers;

import java.util.Scanner;

public class PrimeNumberInGivenRange {

    public static void logic() {
        int s1, s2, flag, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        s1 = s.nextInt();
        System.out.println("Enter the upper limit:");
        s2 = s.nextInt();
        System.out.println("The prime numbers in between the entered limits are:");

        for (i = s1; i <= s2; i++) {
            if (i > 1) {
                flag = 1;
                for (j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println(i);
                }
            }
        }

    }
}
