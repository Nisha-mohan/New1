package src.ATB5xJavaPractice.basics_23Dec;

import java.util.Scanner;

public class Dec23_prog15 {
    public static void main(String[] args) {
        //Verify if a number provided by user is prime number or not, using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int i;
        if (num == 0 || num == 1)
            System.out.println(num + " is not a prime number");
        else {
            for (i = 2; i < 9; i++) {
                if ((num%i==0)&&(num!=i)) {
                    System.out.println(num + " is not a prime number");
                    break;
                }
            }
            if (i==9)
                System.out.println(num + " is a prime number");
        }
        sc.close();
    }
}
