package SimpleJavaPrograms;

import java.util.Scanner;

public class IntegerEqualityCheck {
    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd integer: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
