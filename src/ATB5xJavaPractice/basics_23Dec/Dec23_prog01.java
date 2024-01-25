package src.ATB5xJavaPractice.basics_23Dec;

import java.util.Scanner;

public class Dec23_prog01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        double x = sc.nextDouble();
        System.out.println("Enter y : ");
        double y = sc.nextDouble();
        System.out.println("Enter z : ");
        double z = sc.nextDouble();

        double result = 0;

        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println("Result is "+ result);
        sc.close();
    }
}
