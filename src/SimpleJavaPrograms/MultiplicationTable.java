package SimpleJavaPrograms;

import java.util.Scanner;

public class MultiplicationTable {

    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the table you want: ");
        int n = sc.nextInt();


        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
