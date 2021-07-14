
// Written by M.R.VIJAY PRASAD MTECH SOFTWARE ENGINEER

import java.util.Scanner;
public class Swapping_without_temp_variable {
    public static void main(String x [])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("You can see how to swap without Temp variable \n");
        System.out.print("Enter the values for A & B for Swapping :\n ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Before Swapping  :");
        System.out.println("The value of A is : " + a);
        System.out.println("The value of B is " + b + "\n");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping : ");
        System.out.println("The value of A is : " + a);
        System.out.println("The value of B is " + b);
    }
}


// Written by M.R.VIJAY PRASAD MTECH SOFTWARE ENGINEER