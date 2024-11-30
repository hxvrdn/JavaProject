package SimpleJavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void logic() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Before Swapping");
        System.out.println("The First Number: " + (num1) + " The Second Number:  " + (num2));

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: ");
        System.out.println("The First Number: " + num1 + " The Second Number: " + num2);


    }
}
