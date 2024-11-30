package SimpleJavaPrograms;

import java.util.Scanner;

public class IfNumberIsDivisibleByNumber {
    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Dividend Number ");
        int num = sc.nextInt();

        System.out.println("Enter an Divisor ");
        int div = sc.nextInt();

        if (num % div == 0) {
            System.out.println("Divisible by " + div + " is true");
        }
        else {
            float rem = (float)num % div;
            System.out.println("Dividing "+ num+"/"+div+" yeilds a remainder of "+rem);
        }


    }
}
