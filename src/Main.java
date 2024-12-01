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
            System.out.println("6. Check Divisibility");
            System.out.println("7. Integer Equality Check");
            System.out.println("8. Sum of Digits in a number");
            System.out.println("9. Sum of Digits using Recursion");
            System.out.println("0. Exit");
            int subchoice = scanner.nextInt();
            switch (subchoice)
            {
                case 1: {
                    EvenOdd.logic();
                } break;

                case 2: {
                    EvenOddSum.logic();
                } break;

                case 3: {
                    PositiveNegativeNumber.logic();
                    break;
                }

                case 4: {
                    LargertOf3Numbers.logic();
                    break;
                }

                case 5: {
                    SwapTwoNumbers.logic();
                    break;
                }

                case 6:{
                    IfNumberIsDivisibleByNumber.logic();
                    break;
                }

                case 7: {
                    IntegerEqualityCheck.logic();
                    break;
                }

                case 8:{
                    SumOfDigits.logic();
                    break;
                }

                case 9:{
                    SumOfDigitsWithRecursion.logic();
                    break;
                }



                case 0: {
                    System.exit(0);
                }

                default:
                    break;

            }

            break;
    }
    }
}