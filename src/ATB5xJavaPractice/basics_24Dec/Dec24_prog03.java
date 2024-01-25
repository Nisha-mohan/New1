package src.ATB5xJavaPractice.basics_24Dec;

public class Dec24_prog03 {
    public static void main(String[] args) {
        //Arrays
        int[] a={90,38,46,76,98};
        int[] b={90,38,46,76,98};
        System.out.println(a==b);

        int[] c=a;
        System.out.println(a==c);

        c[0]=100;
        System.out.println(a[0]);
        System.out.println(c[0]);

    }
}
