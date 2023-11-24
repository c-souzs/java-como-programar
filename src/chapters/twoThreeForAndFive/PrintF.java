package chapters.twoThreeForAndFive;

/**
 * %s - String.
 * %d - inn, byte, short, long.
 * %f - float, double.
 * %b - boolean.
 * %c - char.
 * %n - nova linha.
 * %t - tab.
 * %20s - 20 espacos.
 * %.2f - duas casas decimais.
 */
public class PrintF {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.123456f;
        double d = 6.1234567890123;
        boolean bool = true;
        char c = 'a';

        System.out.printf("%d\n", b);
        System.out.printf("%d\n", s);
        System.out.printf("%d\n", i);
        System.out.printf("%d\n", l);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.2f\n", d);
        System.out.printf("%b\n", bool);
        System.out.printf("%c\n", c);

        String str = "Hello, World!";
        System.out.printf("%20s\n", str);

        System.out.printf("Hello,\\nWorld!%n");
        System.out.printf("Hello,\\tWorld!%n");
        System.out.printf("Hello,\\rWorld!%n");
        System.out.printf("Hello,\\\\World!%n");
        System.out.printf("Hello,\\\"World!\\\"%n");
    }
}
