package SimpleJavaPrograms;

import java.util.Scanner;

public class EvenOddSum {
    public static void logic()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int sumE=0, sumO = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (nums[i] % 2 == 0){
                sumE += nums[i];
            }
            else{
                sumO += nums[i];
            }
        }
        System.out.println("The sum of even numbers is: " + sumE);
        System.out.println("The sum of odd numbers is: " + sumO);
    }
}
