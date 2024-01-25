package src.ATB5xJavaPractice.MethodOverloading;

public class Example2 {
    public static void main(String[] args) {
        print_();
        print_(24,89);
        print_("Custom Message printed");
        print_("10th Percentage is " + print_(45));
    }

    private static int print_(int i) {
        return i+10;
    }

    private static void print_(String customMessagePrinted) {
        System.out.println(customMessagePrinted);
    }

    private static void print_(int i, int i1) {
        System.out.println("Sum of numbers -> " + (i+i1));
    }

    private static void print_() {
        System.out.println("Empty message");

    }
}
