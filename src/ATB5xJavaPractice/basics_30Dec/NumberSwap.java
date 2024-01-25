package src.ATB5xJavaPractice.basics_30Dec;
import java.util.Scanner;
public class NumberSwap {
    public static void main(String[] args) {

        // Swapping 2 numbers without using a 3rd variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();

        a = a+b; // 43+12 -> 55
        b = a-b; // 55-12 -> 43
        a = a-b; //  55-43 -> 12

        System.out.println("Value of a -> " + a);
        System.out.println("Value of b -> " + b);
    }
}
