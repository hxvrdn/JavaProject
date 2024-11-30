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


                default:
                    break;

            }

            break;
    }
    }
}