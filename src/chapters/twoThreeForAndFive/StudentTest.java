package chapters.twoThreeForAndFive;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average = 0;
        double note;
        int count = 0;

        System.out.println("Selecione -1 para sair.");
        note = input.nextDouble();

        while (note != -1) {
            average+=note;
            count++;

            System.out.println("Selecione -1 para sair.");
            note = input.nextDouble();
        }

        if(average != 0) {
            average = average / count;

            System.out.printf("A média é %.2f", average);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        int countStudent = 1;
        int amountApproved = 0;
        int amountFalied = 0;
        int approvedOrFalied = 0;

        while (countStudent <= 10) {
            System.out.printf("O %dº foi aprovado?%n 1- Sim%n 2- Não.%n", countStudent);
            approvedOrFalied = input.nextInt();

            if(approvedOrFalied == 1) amountApproved++;
            else amountFalied++;

            countStudent++;
        }

        System.out.printf("Tivemos %d alunos aprovados%n", amountApproved);
        System.out.printf("Tivemos %d alunos reprovados%n", amountFalied);
        if (amountApproved > 8) System.out.println("Bonus to instructor!");
    }
}
