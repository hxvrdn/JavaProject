package SimpleJavaPrograms;

import java.io.Console;
import java.util.Scanner;

public class EvenOdd {
    public static void logic()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}
