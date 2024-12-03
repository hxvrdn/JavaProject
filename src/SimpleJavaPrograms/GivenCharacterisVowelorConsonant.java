package SimpleJavaPrograms;

import java.util.Scanner;

public class GivenCharacterisVowelorConsonant {

    public static void logic() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch +" is Consonant ");
                break;


        }
    }
}
