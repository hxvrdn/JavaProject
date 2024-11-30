package SimpleJavaPrograms;

import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Positive number");
        }
    }

}
