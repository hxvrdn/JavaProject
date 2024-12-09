import java.io.Console;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.util.Scanner;

import JavaProgramsOnNumbers.*;
import SimpleJavaPrograms.*;


public class Main {
    public static void main(String[] args) throws IOException {
    System.out.println("Welcome to Java");
    System.out.println("Select the Scope of programming: ");
    System.out.println("1. Simple programs");
    System.out.println("2. Java Number programs");
    Scanner scanner = new Scanner(System.in);
    int choice =  scanner.nextInt();
    switch (choice) {
        case 1:

            System.out.println("1. Given Number is Even or Odd.");
            System.out.println("2. Sum of Even and Odd Numbers.");
            System.out.println("3. Given Number is positive or negative.");
            System.out.println("4. Largest number in a given 3 Numbers.");
            System.out.println("5. Swap Two numbers.");
            System.out.println("6. Check Divisibility.");
            System.out.println("7. Integer Equality Check.");
            System.out.println("8. Sum of Digits in a number.");
            System.out.println("9. Sum of Digits using Recursion.");
            System.out.println("10. Extract Digits From A Number.");
            System.out.println("11. Extract Digits From A Number And Increment by 1.");
            System.out.println("12. Arithmetic Operations.");
            System.out.println("13. Binary Equivalent of a number");
            System.out.println("14. Multiplication Table");
            System.out.println("15. Given Character is Vowel or Consonant.");
            System.out.println("16. Given Alphabets are Uppercase or Lowercase or Digits");
            System.out.println("17. Height Categorization");


            System.out.println("0. Exit");
            int subchoice1 = scanner.nextInt();
            switch (subchoice1)
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

                case 10:{
                    ExtractDigitsFromANumber.logic();
                    break;

                }

                case 11:{
                    IncremenetEveryDigitOfInteger.logic();
                    break;

                }

                case 12:{
                    ArithmeticOperations.logic();
                    break;
                }

                case 13:{
                    BinaryEquivalentofANumber.logic();
                    break;
                }

                case 14: {
                    MultiplicationTable.logic();
                    break;
                }

                case 15:
                    GivenCharacterisVowelorConsonant.logic();
                    break;

                case 16:
                    AlphabetsUppercaseorLowercaseorDigits.logic();
                    break;

                case 17:
                    HeightCAtegorization.logic();
                    break;

                case 0: {
                    System.exit(0);
                }

                default:
                    break;

            }

        case 2:
            System.out.println("1. Print Prime Numbers in a range. ");
            System.out.println("2. Check if Number is Perfect");
            System.out.println("3. Check if Number is Armstrong");
            System.out.println("4. Armstrong numbers Between 1 and 1000");
            System.out.println("5. Program to reverse Number.");
            System.out.println("6. Program to check pallindrome");
            System.out.println("7. Program to Print natural numbers.");
            Scanner sc = new Scanner(System.in);
            int subchoice2 = sc.nextInt();
            switch (subchoice2) {

                case 1:
                    PrimeNumberInGivenRange.logic();
                    break;
                case 2:
                    CheckPerfectNumber.logic();
                    break;
                case 3:
                    CheckArmstrongNumber.logic();
                    break;

                case 4:
                    ArmstronBetween1and1000.logic();
                    break;

                case 5:
                    ProgramToReverseNumbe.logic();
                    break;

                case 6:
                    PallindromeCheck.logic();
                    break;
                case 7:
                    FirstNnaturalnumbers.logic();
                    break;

                default:
                    break;

            }
            break;



        default:
            break;
        }





    }

}