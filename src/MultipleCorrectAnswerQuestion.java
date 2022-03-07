import java.util.Arrays;

class MultipleCorrectAnswerQuestion extends MultipleChoiceQuestion {
    public MultipleCorrectAnswerQuestion(String question, String answer, String[] optons) {
        super(question, answer, optons);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        userAnswer = userAnswer.replaceAll("\\s+", "");
        String[] userAnswers = userAnswer.split(",");
        Arrays.sort(userAnswers);
        String userAnswerString = Arrays.toString(userAnswers);
        return userAnswerString.equals(this.getAnswer());
     }
}
