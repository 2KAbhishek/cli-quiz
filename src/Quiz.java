import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz!");
        System.out.println("How many questions do you want?");
        int numQuestions = input.nextInt();

        QuestionBank questionBank = new QuestionBank();

        numQuestions = Math.min(numQuestions, questionBank.getNumQuestions());

        ArrayList<Question> questions = (ArrayList<Question>)(questionBank.getQuestions().subList(0, numQuestions));

        int score = 0;

        for (Question question : questions) {
            System.out.println(question);

            switch (question.getClass().getSimpleName()) {
                case "MultipleChoiceQuestion":
                    System.out.print("Enter one option: ");
                    break;
                case "MultipleCorrectAnswerQuestion":
                    System.out.print("Enter multiple options (comma seperated): ");
                    break;
                case "TrueFalseQuestion":
                    System.out.print("Enter Y or N: ");
                    break;
                default:
                    System.out.print("Enter your answer: ");
                    break;
            }

            String answer = input.nextLine();
            if (question.checkAnswer(answer)) {
                score+=10;
            }
            System.out.println();
        }

        input.close();
        System.out.println("You scored " + score + " out of " + questions.size() * 10 + ".");
    }
}
