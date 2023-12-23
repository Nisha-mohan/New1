package src.ATB5xJavaPractice;

import java.util.Scanner;

public class Dec23_prog12 {
    public static void main(String[] args) {
        //factorial with while & for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        long result = 1;
        int i=1;
        while (i<=num){
            result = result *i;
            i++;
        }
        System.out.println("Factorial of "+ num+ " is "+ result);
        result=1;
        for (int j=1; j<=num; j++)
            result = result * j;
        System.out.println("Factorial of "+ num+ " is "+ result);

        sc.close();

    }
}
