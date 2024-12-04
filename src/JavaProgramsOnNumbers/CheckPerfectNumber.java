package JavaProgramsOnNumbers;

import java.util.Scanner;

public class CheckPerfectNumber {
    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum =0;
        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                sum = sum + i;
            }


        }
        if (num == sum) {
            System.out.println(num + " is a perfect number.");
        }
        else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
