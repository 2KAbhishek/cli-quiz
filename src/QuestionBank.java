import java.util.ArrayList;

class QuestionBank {
    ArrayList<Question> questions = new ArrayList<Question>();
    QuestionBank() {
        questions.add(new MultipleChoiceQuestion("What is the capital of France?", "a", new String[] {"Paris", "London", "Berlin", "Rome"}));
        questions.add(new TrueFalseQuestion("1+1 is 2", true));
        questions.add(new MultipleCorrectAnswerQuestion("Which of the following is a fruit?", "[a, b, d]", new String[] {"Apple", "Banana", "Potato", "Pear"}));
        questions.add(new NumericalQuestion("What is the square root of 4?", 2));
    }

    ArrayList<Question> getQuestions() {
        return questions;
    }

    int getNumQuestions() {
        return questions.size();
    }
}
