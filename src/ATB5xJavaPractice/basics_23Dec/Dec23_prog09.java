package src.ATB5xJavaPractice.basics_23Dec;

public class Dec23_prog09 {
    public static void main(String[] args) {
        //continue usage
        for (int i = 0; i <10; i++) {
            if (i%2==0) {
                System.out.println(i +" is even");
                continue;
            }
            System.out.println(i+" is odd");
        }
    }
}
