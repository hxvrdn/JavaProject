package JavaProgramsOnNumbers;

import java.util.Scanner;

public class FirstNnaturalnumbers {

    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if(i%5 ==0)
            {
                System.out.println();
            }

        }

    }
}
