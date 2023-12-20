package chapterSix;

import java.util.Scanner;

public class CaiSystemEducationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int difficultyLevel;
        TypeQuestion typeQuestion;

        System.out.println("Enter the difficulty: \n 1- easy \n 2- medium \n 3- hard");
        difficultyLevel = scanner.nextInt();

        System.out.println("Enter the type of quiz: \n 1- addition \n 2- subtraction \n 3- multiplication \n 4- division \n 5- random");
        typeQuestion = TypeQuestion.values()[scanner.nextInt() - 1];

        CaiSystemEducation caiSystemEducation = new CaiSystemEducation(difficultyLevel, typeQuestion);
        caiSystemEducation.start();

        scanner.close();
    }
}
