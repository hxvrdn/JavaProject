package JavaProgramsOnNumbers;

import java.util.Scanner;

public class ProgramToReverseNumbe {
    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int n, sum =0;
        while (num > 0) {
            n = num % 10;
            sum = sum*10 + n;
            num = num / 10;
        }
        System.out.println(sum);
    }
}


