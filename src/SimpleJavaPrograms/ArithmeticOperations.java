package SimpleJavaPrograms;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator.");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition");
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Result: "+ (a+b));
                break;
            case 2:
                System.out.println("Subtraction");
                System.out.println("Enter first number");
                int c = sc.nextInt();
                System.out.println("Enter second number");
                int d = sc.nextInt();
                System.out.println("Result: "+ (c-d));
                break;
            case 3:
                System.out.println("Multiplication");

                System.out.println("Enter first number");
                int e = sc.nextInt();
                System.out.println("Enter second number");
                int f = sc.nextInt();
                System.out.println("Result: "+ (e*f));
                break;
            case 4:
                System.out.println("Division");
                System.out.println("Enter first number");
                int g = sc.nextInt();
                System.out.println("Enter second number");
                int h = sc.nextInt();
                if(h ==0)
                {
                    System.out.println("Division by zero");
                    break;
                }
                else {

                    System.out.println("Result: "+ ((double)g/h));
                    break;
                }

            case 0:
                System.out.println("Goodbye!");
                break;

            default:
                    System.out.println("Wrong choice. Try again.");
                    break;

        }
    }
}
