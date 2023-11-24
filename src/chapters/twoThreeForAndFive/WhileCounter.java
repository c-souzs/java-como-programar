package chapters.twoThreeForAndFive;

import java.util.Scanner;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 0;
        int value = 1;
        Scanner input = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Insira um valor de uma nota: ");
            value += input.nextInt();

            counter++;
        }

        System.out.printf("A média das notas do valores inserido é %d%n", value / counter);
    }
}
