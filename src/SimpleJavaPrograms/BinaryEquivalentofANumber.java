package SimpleJavaPrograms;

import java.util.Scanner;

public class BinaryEquivalentofANumber {
    public static void logic()
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        BinaryEquivalentofANumber obj = new BinaryEquivalentofANumber();
        String m = obj.Binary(n);
        System.out.println("Answer:"+m);
    }
    String Binary(int x)
    {
        if(x > 0)
        {
            int a = x % 2;
            x = x / 2;
            return a + "" + Binary(x);
        }
        return "";
    }
}
