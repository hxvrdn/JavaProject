package SimpleJavaPrograms;

import java.util.Scanner;

public class SumOfDigitsWithRecursion {

    int sum = 0;
    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        SumOfDigitsWithRecursion ob = new SumOfDigitsWithRecursion();
        int a = ob.add(n);

        System.out.println("The sum of digits is: " + a);

    }

    int add(int n)
    {
        sum = n % 10;
        if (n == 0)
        {
            return sum;
        }
        else
        {
            return sum + add(n/10);
        }

    }
}
