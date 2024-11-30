package SimpleJavaPrograms;

import java.util.Scanner;

public class LargertOf3Numbers {
    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        int num2;
        System.out.println("Enter 2nd number: ");
        while (num1 == (num2 = sc.nextInt())) {
            System.out.println("Keep Values of the numbers different");
            System.out.println("Enter 2nd number: ");
        }


        int num3;
        System.out.println("Enter 3rd number: ");
        while (num2 == (num3 = sc.nextInt()) || num3 == num1) {
            System.out.println("Keep Values of the numbers different");
            System.out.println("Enter 3rd number: ");
        }


        if (num1 > num2 && num1 > num3 ) {
            System.out.println(num1 + "is the greatest of the three numbers");
        }
        else if (num2 > num1 && num2 > num3 ) {
            System.out.println(num2 + "is the greatest of the three numbers");
        }
        else if (num3 > num1 && num3 > num2 ) {
            System.out.println(num3 + "is the greatest of the three numbers");
        }

    }

}
