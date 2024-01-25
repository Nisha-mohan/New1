package src.ATB5xJavaPractice.basics_24Dec;

import java.util.Scanner;

public class Dec24_prog06 {
    public static void main(String[] args) {
        int[] marks=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for English");
        marks[0]=sc.nextInt();
        System.out.println("Enter marks for Tamil");
        marks[1]=sc.nextInt();
        System.out.println("Enter marks for Maths");
        marks[2]=sc.nextInt();
        System.out.println("Enter marks for Science");
        marks[3]=sc.nextInt();
        System.out.println("Enter marks for Social");
        marks[4]=sc.nextInt();
        sc.close();
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
