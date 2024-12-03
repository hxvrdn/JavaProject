package SimpleJavaPrograms;

import java.util.Scanner;

public class HeightCAtegorization {
    public static void logic() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height : ");
        int height = sc.nextInt();
        if (height > 175) {
            System.out.println("Person is tall");

        }
        else if ( 155 <= height &&  height <= 175 ) {
            System.out.println("Person is average heighted");
        }

        else
            System.out.println("Person is Dwarf");
    }
}
