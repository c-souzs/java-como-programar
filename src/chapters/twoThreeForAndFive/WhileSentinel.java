package chapters.twoThreeForAndFive;

import java.util.Scanner;

public class WhileSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valueTotal = 0;
        int counter = 0;

        System.out.println("Para sair, digite 0.");
        System.out.println("Insira o valor de uma nota: ");
        int value = input.nextInt();

        while (value != 0) {
            System.out.println("Para sair, digite 0.");
            System.out.println("Insira o valor de uma nota: ");
            value = input.nextInt();

            valueTotal+=value;
            counter++;
        }

        if(counter != 0) {
            System.out.printf("Soma de todas as notas foram: %d. %n", valueTotal);
            System.out.printf("Tivemos: %d notas. %n", counter);
            double average = (double) valueTotal / counter;
            System.out.printf("A media é: %.2f.%n", average);
        } else System.out.println("Nenhuma nota cadastrada.");
    }
}
