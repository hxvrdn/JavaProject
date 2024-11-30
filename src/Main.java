import java.io.Console;
import java.lang.ref.Cleaner;
import java.util.Scanner;
import SimpleJavaPrograms.*;


public class Main {
    public static void main(String[] args) {
    System.out.println("Welcome to Java");
    System.out.println("Select the Scope of programming: ");
    System.out.println("1. Simple programs");
    Scanner scanner = new Scanner(System.in);
    int choice =  scanner.nextInt();
    switch (choice) {
        case 1:

            System.out.println("1. Given Number is Even or Odd.");
            System.out.println("2. Sum of Even and Odd Numbers.");
            System.out.println("3. Given Number is positive or negative.");
            System.out.println("4. Largest number in a given 3 Numbers");
            System.out.println("5. Swap Two numbers");
            int subchoice = scanner.nextInt();
            switch (subchoice)
            {
                case 1: {
                    EvenOdd ob = new EvenOdd();
                    ob.logic();
                } break;

                case 2: {
                    EvenOddSum ob = new EvenOddSum();
                    ob.logic();
                } break;

                case 3: {
                    PositiveNegativeNumber.logic();
                    break;
                }

                case 4: {
                    LargertOf3Numbers ob = new LargertOf3Numbers();
                    ob.logic();
                    break;
                }

                case 5: {
                    SwapTwoNumbers ob = new SwapTwoNumbers();
                    ob.logic();
                    break;
                }

                default:
                    break;

            }

            break;
    }
    }
}