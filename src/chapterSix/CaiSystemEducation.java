package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CaiSystemEducation {
    private Scanner scanner;
    private SecureRandom randomNumbers;
    private int amountOfQuestions = 10;
    private int amountCorrectAnswers = 0;
    private int answer = 0;
    private boolean isCorrectAnswer;
    private int indexMessageFeedback;
    private CaiQuestionEducation caiQuestionEducation;
    private int difficultyLevel;
    private TypeQuestion typeQuiz;

    public CaiSystemEducation(int difficultyLevel, TypeQuestion typeQuestion) {
        scanner = new Scanner(System.in);
        randomNumbers = new SecureRandom();

        this.difficultyLevel = difficultyLevel;
        this.typeQuiz = typeQuestion;
    }

    public void start() {
        System.out.println("------ CAI System Education ------");
        controlQuiz();
        showResult();
    }

    private void controlQuiz() {
        while (amountOfQuestions > 0 ) {
            caiQuestionEducation = new CaiQuestionEducation(difficultyLevel, typeQuiz);

            System.out.println(caiQuestionEducation.getQuestion());
            answer = scanner.nextInt();

            isCorrectAnswer = caiQuestionEducation.isCorrectAnswer(answer);
            amountCorrectAnswers = isCorrectAnswer ? amountCorrectAnswers + 1 : amountCorrectAnswers;
            indexMessageFeedback = 1 + randomNumbers.nextInt(4);

            switch (indexMessageFeedback) {
                case 1:
                    if(isCorrectAnswer) {
                        System.out.println("Very good!");
                    } else {
                        System.out.println("No. Please try again.");
                    }
                    break;
                case 2:
                    if(isCorrectAnswer) {
                        System.out.println("Great!");
                    } else {
                        System.out.println("Wrong. Try one more time.");
                    }
                    break;
                case 3:
                    if(isCorrectAnswer) {
                        System.out.println("Good work!");
                    } else {
                        System.out.println("Do not give up!");
                    }
                    break;
                case 4:
                    if(isCorrectAnswer) {
                        System.out.println("Keep up the good work!");
                    } else {
                        System.out.println("No. Keep trying.");
                    }
                    break;
            }

            amountOfQuestions--;
        }
    }

    private void showResult() {
        if(amountCorrectAnswers >= 8) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
