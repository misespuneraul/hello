/** This is a simple Java program. */

public class HelloWorld {
    /** * Your program begins with a call to main().
        * Prints "Hello, World" to the terminal window. */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Exercitiul 3");

        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.50;
        double amount = 50.0;
        String hello = "world";

        System.out.println(yes == no || grade > amount);
//        System.out.println(amount == 40.0 || 50.0);
        System.out.println(hiVal != loVal || loVal < 0);
        System.out.println(true || hello.length() > 0);
        System.out.println(hello.isEmpty() && yes);
        System.out.println(grade <= 100 && !false);
        System.out.println(!yes || no);
//        System.out.println(grade > 75 > amount);
        System.out.println(amount <= hiVal || amount >= loVal);
        System.out.println(no && !no || yes && !yes);

        System.out.println("Exercitiul 4");

        float a = 100.25f;
        System.out.println(a);
        long b = (long) a;
        System.out.println(b);
        int c = (int) b;
        System.out.println(c);
        byte d = (byte) c;
        System.out.println(d);

        System.out.println("Exercitiul 5");

        int value = 5;
        System.out.println(value + -value - value++ % 10);
        System.out.println(value - value + --value / 10);
        System.out.println(value);
        for (int i = 2; i < 5; ) {
            i++;
            value += value;
        }
        System.out.println("value = " + value);
    }
}