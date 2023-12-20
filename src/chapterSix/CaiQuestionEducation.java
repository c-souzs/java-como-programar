package chapterSix;

import java.security.SecureRandom;

public class CaiQuestionEducation {
    private final SecureRandom randomNumbers = new SecureRandom();
    private int number1;
    private int number2;
    private int answer;
    private int difficultyLevel;
    private TypeQuestion typeQuestion;


    public CaiQuestionEducation(int difficultyLevel, TypeQuestion typeQuestion) {
        this.difficultyLevel = difficultyLevel;
        this.typeQuestion = typeQuestion;

        generateQuestion();
    }

    private void generateQuestion() {
        settingsBasedDifficultyLevel();
        settingsBasedTypeQuestion();
    }

    private void settingsBasedDifficultyLevel() {
        int rangeMax;
        int rangeMin;

        switch (difficultyLevel) {
            case 2:
                rangeMax = 89;
                rangeMin = 10;
                break;
            case 3:
                rangeMax = 899;
                rangeMin = 100;
                break;
            default:
                rangeMax = 8;
                rangeMin = 1;
                break;
        }

        number1 = rangeMin + randomNumbers.nextInt(rangeMax);
        number2 = rangeMin + randomNumbers.nextInt(rangeMax);
    }

    private void settingsBasedTypeQuestion() {
        checkTypeQuestionRandom();

        switch (typeQuestion) {
            case ADD:
                answer = number1 + number2;
                break;
            case SUBTRACT:
                answer = number1 - number2;
                break;
            case MULTIPLY:
                answer = number1 * number2;
                break;
            case DIVIDE:
                answer = number1 / number2;
                break;
            default:
                break;
        }
    }

    private void checkTypeQuestionRandom() {
        if (typeQuestion == TypeQuestion.RANDOM) {
            int randomTypeQuestion = 1 + randomNumbers.nextInt(4);

            switch (randomTypeQuestion) {
                case 1:
                    typeQuestion = TypeQuestion.ADD;
                    break;
                case 2:
                    typeQuestion = TypeQuestion.SUBTRACT;
                    break;
                case 3:
                    typeQuestion = TypeQuestion.MULTIPLY;
                    break;
                case 4:
                    typeQuestion = TypeQuestion.DIVIDE;
                    break;
                default:
                    break;
            }
        }
    }

    public String getQuestion() {
        return String.format("How much is %d %c %d?", number1, typeQuestion.getSymbol(), number2);
    }

    public boolean isCorrectAnswer(int answer) {
        return this.answer == answer;
    }
}
